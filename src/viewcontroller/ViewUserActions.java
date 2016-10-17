/*
 * The controller classes (like the ViewUserActions class) provides actions
 * that the user can trigger through the view classes.  Those actions are 
 * written in this class as private inner classes (i.e. classes 
 * declared inside another class).
 *
 * You can use all the public instance variables you defined in AllModelsForView, 
 * DrawnView, and ViewOutputs as though they were part of this class! This is 
 * due to the magic of subclassing (i.e. using the extends keyword).
 */
package cs20viewcontroller;

import cs20models.PicFile;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ObservableValue;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * ViewUserActions is a class that contains actions users can trigger.
 *
 * User actions are written as private inner classes that implements the
 * ActionListener interface. These actions must be "wired" into the DrawnView in
 * the ViewUserActions constructor, or else they won't be triggered by the user.
 *
 * Actions that the user can trigger are meant to manipulate some model classes
 * by sending messages to them to tell them to update their data members.
 *
 * Actions that the user can trigger can also be used to manipulate the GUI by
 * sending messages to the view classes (e.g. the DrawnView class) to tell them
 * to update themselves (e.g. to redraw themselves on the screen).
 *
 * @author cheng
 */
public class ViewUserActions extends ViewOutputs {

    /*
     * Step 1 of 2 for writing user actions.
     * -------------------------------------
     *
     * User actions are written as private inner classes that implement
     * ActionListener, and override the actionPerformed method.
     *
     * Use the following as a template for writting more user actions.
     */
    private class CreatePicFile implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            int xCord = Integer.parseInt(xTextField.getText());
            int yCord = Integer.parseInt(yTextField.getText());
            if(xCord != 0 && yCord != 0)
                thePicFile = new PicFile(xCord, yCord);
            drawingPicture.setIcon(thePicFile.getAsImageIcon());
            compileLabel.setIcon(thePicFile.getAsImageIcon());
            System.out.println("Create Button Pressed.");
            
        }
    }
    
    /* Put the following private class into your ModelsAndViewsController class
 * just like the other private classes you wrote for implementing ActionListeners
 *
 * Then in the initController of the ModelsAndViewsController class,
 * assuming you have named the JLabel (that will display the ImageIcon) as picContentPane,
 * add these two lines:
        this.theMainViewDisplay.picContentPane.addMouseMotionListener(new MouseAction());
        this.theMainViewDisplay.picContentPane.addMouseListener(new MouseAction());
 */

    private class MouseAction extends MouseAdapter {
        // You don't need every one of these methods.
        // Choose, keep, and modify only the mouse events you want to handle.
        // Currently, they all just prints a debug string out,
        // and does the mouseGetPoint private helper method.
        
        private Point lastMousePoint;
        private Point mouseRelease;
        private boolean firstClick = true;
        private boolean xAnswer = true;
        private boolean yAnswer = true;
        
        public void paint(int x, int y, int size)
        {
           final int xOffset = (drawingScrollPane.getWidth() / 2)-(thePicFile.getWidth() / 2);
            final int yOffset = (drawingScrollPane.getHeight() / 2)-(thePicFile.getHeight() / 2);
            if(firstClick == true)
            {
                if((thePicFile.getWidth()) > (drawingScrollPane.getWidth()))
                        xAnswer = false;
                if((thePicFile.getHeight()) > (drawingScrollPane.getHeight()))
                        yAnswer = false;
                firstClick = false;
            }
            if(xAnswer == true){
                x = (x) - (size) - xOffset;
            }
            else
                x = (x) - (size);
            
            if(yAnswer == true){
                y = (y) - (size) - yOffset;
            }
            else
                y = (y) - (size);
            for(int yPos = y; yPos <= (y+((theBrush.getBrushSize())*2)); yPos++){
                for(int xPos = x; xPos <= (x+((theBrush.getBrushSize())*2)); xPos++){
                    
                    thePicFile.setColor(xPos, yPos, (theBrush.getBrushColor()));
                    //drawingPicture.updateUI();
                }
            }
            drawingPicture.updateUI();
        }
        
        @Override
        public void mouseClicked(MouseEvent e) {
            //System.out.print("mouse click"); // comment these print statements out - it's for debug only.
            //mouseGetPoint(e);

            this.paint(e.getX(), e.getY(), theBrush.getBrushSize());
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            //System.out.print("mouse press");
            mouseGetPoint(e);
            this.paint(e.getX(), e.getY(), theBrush.getBrushSize());
            lastMousePoint = e.getPoint();
            //System.out.println("Last Point: " + lastMousePoint);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            //System.out.print("mouse release");
            mouseGetPoint(e);
            mouseRelease = e.getPoint();
            this.paint(e.getX(), e.getY(), theBrush.getBrushSize());
            //mouseClicked(e);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            //System.out.print("mouse enter");
            //mouseGetPoint(e);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            //System.out.print("mouse exit");
            //mouseGetPoint(e);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if(lastMousePoint == null)
                return;
            Point newPoint = e.getPoint();
            this.paint(e.getX(),e.getY(), theBrush.getBrushSize());
            //System.out.println(getDirection(lastMousePoint, newPoint));
            int direction = getDirection(lastMousePoint, newPoint);
            int distance = getDistance(lastMousePoint, newPoint);
            if(direction > 0 && direction < 90){
                paintQuad1(direction, distance, lastMousePoint, newPoint);
            }
            if(direction > 90 && direction < 180){
                paintQuad2(direction, distance, lastMousePoint, newPoint);
            }
            if(direction > -180 && direction < -90){
                paintQuad3(direction, distance, lastMousePoint, newPoint);
            }
            if(direction > -90 && direction < 0){
                paintQuad4(direction, distance, lastMousePoint, newPoint);
            }
            if(direction == 90 || direction == -90){
                paintVertical(lastMousePoint, newPoint, direction);
            }
            lastMousePoint = newPoint;
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            //System.out.print("mouse moved");
            //mouseGetPoint(e);
        }

        private void mouseGetPoint(MouseEvent e) {
            Point p = e.getPoint();
            //System.out.println(" x y: " + p.x + " " + p.y);
        }
        
        private void paintVertical(Point a, Point b, int dir){
           // System.out.println("Printed Vertcal.");
            if(dir > 0){
                for(int y = 1; y < ((int)a.getY() - (int)b.getY()); y++){
                    paint((int)b.getX(), ((int)a.getY() - y), theBrush.getBrushSize());
                }
            }
            else{
                for(int y = 1; y < ((int)b.getY() - (int)a.getY()); y++){
                    paint((int)b.getX(), ((int)a.getY() + y), theBrush.getBrushSize());
                }
            }
        }
        
        private void paintQuad1(int dir, int dis, Point a, Point b){
            //a is the previous point, b is the new point.
            double direction = Math.toRadians((double)dir);
            int distance = dis;
            for(int x = 1; x < ((int)b.getX() - (int)a.getX()); x++){
                if(x > distance)
                    return;
                int y = (int)(Math.tan(direction) * x);
                System.out.println("Y = " + y);
                paint(((int)a.getX() + x), ((int)a.getY() - y), theBrush.getBrushSize());
            }
        }
        
        private void paintQuad2(int dir, int dis, Point a, Point b){
            //a is the previous point, b is the new point.
            int dirr = 90 - ((dir + 90)*-1);
            double direction = Math.toRadians((double)dirr);
            int distance = dis;
            for(int x = 1; x < ((int)a.getX() - (int)b.getX()); x++){
                if(x > distance)
                    return;
                int y = (int)(Math.tan(direction) * x);
                System.out.println("Y = " + y);
                paint(((int)a.getX() - x), ((int)a.getY() + y), theBrush.getBrushSize());
            }
        }
        
        private void paintQuad3(int dir, int dis, Point a, Point b){
            //a is the previous point, b is the new point.
            int dirr = 90 - (dir - 90);
            double direction = Math.toRadians((double)dirr);
            int distance = dis;
            for(int x = 1; x < ((int)a.getX() - (int)b.getX()); x++){
                if(x > distance)
                    return;
                int y = (int)(Math.tan(direction) * x);
                System.out.println("Y = " + y);
                paint(((int)a.getX() - x), ((int)a.getY() - y), theBrush.getBrushSize());
            }
        }
        
        private void paintQuad4(int dir, int dis, Point a, Point b){
            //a is the previous point, b is the new point.
            int dirr = dir * -1;
            double direction = Math.toRadians((double)dirr);
            int distance = dis;
            for(int x = 1; x < ((int)b.getX() - (int)a.getX()); x++){
                if(x > distance)
                    return;
                int y = (int)(Math.tan(direction) * x);
                System.out.println("Y = " + y);
                paint(((int)a.getX() + x), ((int)a.getY() + y), theBrush.getBrushSize());
            }
        }
        
        private int getDirection(Point a, Point b){
            double ax = a.getX();
            double ay = a.getY();
            double bx = b.getX();
            double by = b.getY();
            double x = bx - ax;
            double y = by - ay;
            
            
            double dir = Math.atan2(y, x);
            int direction = (int)Math.toDegrees(dir);
            return direction*-1;
            
        }
        private int getDistance(Point a, Point b){
            
            int xDifference = Math.abs((int)(a.getX() - b.getX()));
            int yDifference = Math.abs((int)(a.getY() - b.getY()));
            
            double midway = Math.pow(xDifference, 2.0) + Math.pow(yDifference, 2.0);
            int theDistance = (int)Math.round(Math.sqrt(midway));
            //System.out.println("The distance is: " + theDistance);
            
            return theDistance;
        }
        
    }
    
    private class SaveButtonPressed implements ActionListener
    {
        private int count = 0;
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            afterSaveLabel.setVisible(false);
            if ((count % 2) == 0)
            {
                jpgButton.setSelected(true);
                savePanel.setVisible(true);
            }
            else
            {
                savePanel.setVisible(false);
                jpgButton.setSelected(false);
                pngButton.setSelected(false);
            }
            count++;
            
        }
    }
    
    private class FinalSaveButtonPressed implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            String fileName = fileNameTextLabel.getText();
            boolean jpg = jpgButton.isSelected();
            boolean png = pngButton.isSelected();
            
            if(jpg)
            {
                try {
                    thePicFile.saveToDisk(fileName, "jpg");
                } catch (IOException ex) {
                    Logger.getLogger(ViewUserActions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(png)
            {
                try {
                    thePicFile.saveToDisk(fileName, "png");
                } catch (IOException ex) {
                    Logger.getLogger(ViewUserActions.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            afterSaveLabel.setVisible(true);
        }    
    }
    
    private class JpgFileTypePressed implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            if((jpgButton.isSelected()))
            {
                pngButton.setSelected(false);
            }
        }
    }
    
    private class PngFileTypePressed implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            if((pngButton.isSelected()))
            {
                jpgButton.setSelected(false);
            }
        }
    }
    
    private class ColorChooser implements ChangeListener
    {
        @Override
        public void stateChanged(ChangeEvent e)
        {
            Color c = colourChooser.getColor();
            theBrush.setBrushColor(c);
        }
    }
    
    private class BrushSizeChooser implements ChangeListener
    {
        @Override
        public void stateChanged(ChangeEvent e)
        {
            int size = brushSizeSlider.getValue();
            //System.out.println(size);
            brushSize.setText(Integer.toString(size));
            theBrush.setBrushSize(size);
        }
    }
    
    private class FillButtonPressed implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            //System.out.println("Fill Button Pressed.");
            for(int x = 0; x < thePicFile.getWidth(); x++)
            {
                for(int y = 0; y < thePicFile.getHeight(); y++)
                {
                    thePicFile.setColor(x, y, (theBrush.getBrushColor()));
                }
            }
            drawingPicture.updateUI();
        }
    }   
    
    private class SaveFrameButtonPressed implements ActionListener
    {
        int count = 0;
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            String name = "frame" + count;
            try {
                thePicFile.saveToDisk(name, "png");
            } catch (IOException ex) {
                Logger.getLogger(ViewUserActions.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            PicFile temp = new PicFile(1,1);
            try {
                temp = new PicFile(name + ".png");
            } catch (IOException ex) {
                Logger.getLogger(ViewUserActions.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            PicFile a = temp;
            framesArray[count] = a;
            count++;
            System.out.println("Frame " + count + " added.");
            frameInfo.addAFrame();
            //System.out.println("Frame properties: " + a.toString());
            //compileLabel.setIcon(a.getAsImageIcon());
        }
    }
    
    private class CompileButtonPressed implements ActionListener
    {
        private final int count = frameInfo.getNFrames();
        private int tenTimesCount = 1;
        private int n = 0;
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            frameInfo.setPlayInstance(true);
            Animation a = new Animation();
            a.start();
        }
    }
    
    private class Animation extends Thread
    {
        private int count;
        private int frameRate;
        private int n = 0;
        private final int loop = 10;
        @Override
        public void run()
        {
            
            frameRate = (1000) / (frameInfo.getFramesPerSecond());
            //System.out.println(framesArray[0] + " " + framesArray[1] + " " + framesArray[2] + " " );
            count = frameInfo.getNFrames();
            //loop = 10;
            for(int l = 0; l < loop; l++){
                for(n = 0; n < count; n++){
                    compileLabel.setIcon(framesArray[n].getAsImageIcon());
                    //compileLabel.updateUI();
                    try {
                        Thread.sleep(frameRate);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ViewUserActions.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println(n + "  " + count);

                }
            }
        }
    }
    
    private class SpinnerUsed implements ChangeListener
    {
        @Override
        public void stateChanged(ChangeEvent ce){
            int fps = (Integer)theSpinner.getValue();
            frameInfo.setFramesPerSecond(fps);
            System.out.println(fps);
        }
    }
    
    /*
     * ViewUserActions constructor used for wiring user actions to GUI elements
     */
    public ViewUserActions() {
        /*
         * Step 2 of 2 for writing user actions.
         * -------------------------------------
         *
         * Once a private inner class has been written for a user action, you
         * can wire it to a GUI element (i.e. one of GUI elements you drew in
         * the DrawnView class and which you gave a memorable public variable
         * name!).
         *
         * Use the following as a template for wiring more user actions.
         */
        MouseAction mouseAction = new MouseAction();
                
                
        this.createButton.addActionListener(new CreatePicFile());
        //this.drawingScrollPane.addMouseListener(new MouseAction());
        this.drawingPicture.addMouseMotionListener(mouseAction);
        this.drawingPicture.addMouseListener(mouseAction);
        this.saveAsButton.addActionListener(new SaveButtonPressed());
        this.finalSaveButton.addActionListener(new FinalSaveButtonPressed());
        this.pngButton.addActionListener(new PngFileTypePressed());
        this.jpgButton.addActionListener(new JpgFileTypePressed());
        this.colourChooser.getSelectionModel().addChangeListener(new ColorChooser());
        this.brushSizeSlider.addChangeListener(new BrushSizeChooser());
        this.fillButton.addActionListener(new FillButtonPressed());
        this.saveFrameButton.addActionListener(new SaveFrameButtonPressed());
        this.compileButton.addActionListener(new CompileButtonPressed());
        this.theSpinner.addChangeListener(new SpinnerUsed());
    }
}

//            final int xOffset = (drawingScrollPane.getWidth() / 2)-(thePicFile.getWidth() / 2);
//            final int yOffset = (drawingScrollPane.getHeight() / 2)-(thePicFile.getHeight() / 2);
//            if(firstClick == true)
//            {
//                if((thePicFile.getWidth()) > (drawingScrollPane.getWidth()))
//                        xAnswer = false;
//                if((thePicFile.getHeight()) > (drawingScrollPane.getHeight()))
//                        yAnswer = false;
//                firstClick = false;
//            }
//            //int xOffset = (drawingScrollPane.getWidth() / 2)-(thePicFile.getWidth() / 2);
//            //int yOffset = (drawingScrollPane.getHeight() / 2)-(thePicFile.getHeight() / 2);
//            int x;
//            int y;
//            if(xAnswer == true){
//                x = ((e.getX()) - (theBrush.getBrushSize())) - xOffset;
//            }
//            else
//                x = (e.getX()) - (theBrush.getBrushSize());
//            
//            if(yAnswer == true){
//                y = ((e.getY()) - (theBrush.getBrushSize())) - yOffset;
//            }
//            else
//                y = (e.getY()) - (theBrush.getBrushSize());
//            for(int yPos = y; yPos <= (y+((theBrush.getBrushSize())*2)); yPos++){
//                for(int xPos = x; xPos <= (x+((theBrush.getBrushSize())*2)); xPos++){
//                    
//                    thePicFile.setColor(xPos, yPos, (theBrush.getBrushColor()));
//                    //drawingPicture.updateUI();
//                }
//            }
//            drawingPicture.updateUI();






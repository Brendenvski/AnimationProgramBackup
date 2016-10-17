/*
 * WARNING: There is nothing in this file for students to edit or change.
 *          This file is intended to have no student-serviceable code.
 *
 * "Draw" your GUI using the "Design" tab, and remember to give
 * them memorable variable names in the "Properties" panel
 * as well as make them public variables.
 * 
 * For convenience, you may want to set the default visibility of 
 * GUI elements to be public by going to:
 *    The NetBeans Preferences or Settings menu -> Miscellaneous -> GUI Builder
 * Then set Variables Modifier to public.
 */
package cs20viewcontroller;

import cs20models.AllModelsForView;

/**
 * WARNING: Do NOT modify or write any code in this file!
 *
 * @author cheng
 */
public class DrawnView extends AllModelsForView {
    // WARNING: Do NOT modify or write any code in this file!
    // <editor-fold defaultstate="collapsed" desc="Generated Code">

    public DrawnView() {
        initComponents();
    }// </editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        theSpinner = new javax.swing.JSpinner();
        firstLabel = new javax.swing.JLabel();
        xLabel = new javax.swing.JLabel();
        yLabel = new javax.swing.JLabel();
        brushSettingsLabel = new javax.swing.JLabel();
        brushSizeSlider = new javax.swing.JSlider();
        brushSize = new javax.swing.JLabel();
        brushSizeLabel = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        xTextField = new javax.swing.JTextField();
        yTextField = new javax.swing.JTextField();
        errorLabel = new javax.swing.JLabel();
        saveAsButton = new javax.swing.JButton();
        colourChooser = new javax.swing.JColorChooser();
        brushColorLabel = new javax.swing.JLabel();
        drawingScrollPane = new javax.swing.JScrollPane();
        drawingPicture = new javax.swing.JLabel();
        savePanel = new javax.swing.JPanel();
        fileTypeLabel = new javax.swing.JLabel();
        fileNameTextLabel = new javax.swing.JTextField();
        pngButton = new javax.swing.JRadioButton();
        jpgButton = new javax.swing.JRadioButton();
        fileNameLabel1 = new javax.swing.JLabel();
        finalSaveButton = new javax.swing.JButton();
        afterSaveLabel = new javax.swing.JLabel();
        fillButton = new javax.swing.JButton();
        saveFrameButton = new javax.swing.JButton();
        compileButton = new javax.swing.JButton();
        frameRateLabel = new javax.swing.JLabel();
        fpsLabel = new javax.swing.JLabel();
        drawingScrollPane1 = new javax.swing.JScrollPane();
        compileLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("6");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        theSpinner.setValue(1);

        firstLabel.setText("Select the size of your image: ");

        xLabel.setText("x:");

        yLabel.setText("y:");

        brushSettingsLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        brushSettingsLabel.setText("Brush Settings");

        brushSizeSlider.setMaximum(36);
        brushSizeSlider.setMinimum(1);
        brushSizeSlider.setValue(19);

        brushSize.setForeground(new java.awt.Color(0, 0, 204));
        brushSize.setText("19");

        brushSizeLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        brushSizeLabel.setText("Brush Size: ");

        createButton.setText("Create");

        saveAsButton.setText("Save As..");

        brushColorLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        brushColorLabel.setText("Brush Colour:");

        drawingPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        drawingPicture.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        drawingScrollPane.setViewportView(drawingPicture);

        savePanel.setVisible(false);
        savePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Save"));

        fileTypeLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        fileTypeLabel.setText("Choose a file Type:");

        pngButton.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        pngButton.setText(".png");
        pngButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pngButtonActionPerformed(evt);
            }
        });

        jpgButton.setFont(new java.awt.Font("Impact", 0, 11)); // NOI18N
        jpgButton.setText(".jpg");

        fileNameLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        fileNameLabel1.setText("Enter a file name:");

        finalSaveButton.setBackground(new java.awt.Color(0, 0, 0));
        finalSaveButton.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        finalSaveButton.setText("Save");

        afterSaveLabel.setVisible(false);
        afterSaveLabel.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        afterSaveLabel.setForeground(new java.awt.Color(0, 0, 250));
        afterSaveLabel.setText("Saved!");

        org.jdesktop.layout.GroupLayout savePanelLayout = new org.jdesktop.layout.GroupLayout(savePanel);
        savePanel.setLayout(savePanelLayout);
        savePanelLayout.setHorizontalGroup(
            savePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(savePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(savePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(savePanelLayout.createSequentialGroup()
                        .add(savePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(savePanelLayout.createSequentialGroup()
                                .add(fileNameLabel1)
                                .add(15, 15, 15))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, savePanelLayout.createSequentialGroup()
                                .add(fileTypeLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)))
                        .add(savePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(fileNameTextLabel)
                            .add(savePanelLayout.createSequentialGroup()
                                .add(jpgButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(pngButton)
                                .add(0, 36, Short.MAX_VALUE))))
                    .add(savePanelLayout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(afterSaveLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(finalSaveButton)))
                .addContainerGap())
        );
        savePanelLayout.setVerticalGroup(
            savePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(savePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(savePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(fileNameTextLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(fileNameLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(32, 32, 32)
                .add(savePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jpgButton)
                    .add(fileTypeLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(pngButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(savePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(finalSaveButton)
                    .add(afterSaveLabel))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fillButton.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        fillButton.setText("Fill");

        saveFrameButton.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        saveFrameButton.setText("Save Next Frame");

        compileButton.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        compileButton.setText("Compile");

        frameRateLabel.setText("Select the frame rate: ");

        fpsLabel.setText("Frames per second.");

        drawingScrollPane1.setViewportView(compileLabel);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(173, 173, 173)
                .add(brushSettingsLabel)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(firstLabel)
                        .add(27, 27, 27)
                        .add(xLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(xTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(yLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(yTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(createButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(errorLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(saveAsButton))
                    .add(layout.createSequentialGroup()
                        .add(colourChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 437, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(savePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(brushColorLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(fillButton))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(drawingScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 617, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createSequentialGroup()
                                        .add(brushSizeLabel)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(brushSize)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(brushSizeSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(layout.createSequentialGroup()
                                        .add(saveFrameButton)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(frameRateLabel)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(theSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 92, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(18, 18, 18)
                                        .add(fpsLabel)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(compileButton))
                                    .add(drawingScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 617, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(0, 206, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(firstLabel)
                    .add(xLabel)
                    .add(yLabel)
                    .add(createButton)
                    .add(xTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(yTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(errorLabel)
                    .add(saveAsButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(25, 25, 25)
                .add(brushSettingsLabel)
                .add(25, 25, 25)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(brushColorLabel)
                    .add(fillButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(colourChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 262, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(brushSizeLabel)
                                .add(brushSize))
                            .add(brushSizeSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(drawingScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 467, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(savePanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(saveFrameButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(frameRateLabel)
                            .add(theSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(fpsLabel)
                            .add(compileButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(drawingScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 467, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(53, 82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pngButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pngButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pngButtonActionPerformed
    // WARNING: Do NOT modify or write any code in this file!
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel afterSaveLabel;
    private javax.swing.JLabel brushColorLabel;
    private javax.swing.JLabel brushSettingsLabel;
    public javax.swing.JLabel brushSize;
    private javax.swing.JLabel brushSizeLabel;
    public javax.swing.JSlider brushSizeSlider;
    public javax.swing.JColorChooser colourChooser;
    public javax.swing.JButton compileButton;
    public javax.swing.JLabel compileLabel;
    public javax.swing.JButton createButton;
    public javax.swing.JLabel drawingPicture;
    public javax.swing.JScrollPane drawingScrollPane;
    public javax.swing.JScrollPane drawingScrollPane1;
    public javax.swing.JLabel errorLabel;
    private javax.swing.JLabel fileNameLabel1;
    public javax.swing.JTextField fileNameTextLabel;
    private javax.swing.JLabel fileTypeLabel;
    public javax.swing.JButton fillButton;
    public javax.swing.JButton finalSaveButton;
    private javax.swing.JLabel firstLabel;
    private javax.swing.JLabel fpsLabel;
    private javax.swing.JLabel frameRateLabel;
    public javax.swing.JRadioButton jpgButton;
    public javax.swing.JRadioButton pngButton;
    public javax.swing.JButton saveAsButton;
    public javax.swing.JButton saveFrameButton;
    public javax.swing.JPanel savePanel;
    public javax.swing.JSpinner theSpinner;
    private javax.swing.JLabel xLabel;
    public javax.swing.JTextField xTextField;
    private javax.swing.JLabel yLabel;
    public javax.swing.JTextField yTextField;
    // End of variables declaration//GEN-END:variables
}




































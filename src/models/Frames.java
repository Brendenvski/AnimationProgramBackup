/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs20models;

/**
 *
 * @author Brenden
 */
public class Frames {
    private int numberOfFrames = 0;
    private boolean play = false;
    private int framesPerSecond = 1;
    
    public int getNFrames(){
        return numberOfFrames;
    }
    public void addAFrame(){
        numberOfFrames++;
    }
    public boolean getPlayInstance(){
        return play;
    }
    public void setPlayInstance(boolean b){
        this.play = b;
    }
    public int getFramesPerSecond(){
        return this.framesPerSecond;
    }
    public void setFramesPerSecond(int f){
        this.framesPerSecond = f;
    }
}   

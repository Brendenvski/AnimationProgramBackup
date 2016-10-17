/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs20models;

import java.awt.Color;

/**
 *
 * @author Brenden
 */
public class Brush {
    
    
    private int brushSize;
    private Color brushColor;
    
    public Brush(Color c, int size){
        this.brushColor = c;
        this.brushSize = size;
    }
    
    public void setBrushColor(Color c){
        this.brushColor = c;
    }
    public void setBrushSize(int size){
        this.brushSize = size;
    }
    
    
    public int getBrushSize(){
        return this.brushSize;
    }
    public Color getBrushColor(){
        return this.brushColor;
    }
    
}

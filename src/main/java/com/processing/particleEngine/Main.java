/*
 * Coder: Allison Hart
 * Date 9/8/2024
 * Description: particle engine part 1 project
 * 
 */


package com.processing.particleEngine;

import processing.core.*;

public class Main extends PApplet {

Balls balls; // draws ball simutlation


    public static void main(String[] args) {
        PApplet.main("com.processing.particleEngine.Main");
    }

    //setup function - initializes drawing
    public void settings() {
        size(600, 600);
        balls = new Balls(this);
    }

    
    public void setup()
    {
        balls.setup();
        
    }


    //draws everything on screen
    public void draw()
    { 
        balls.draw();
    }

    // will be a way to interacte w/ particles
public void mousePressed()
{
    balls.mousePressed(mouseX, mouseY);

}


// when mouse is released color changes - easiest to see when balls are bigger
public void mouseReleased()
{
balls.mouseReleased();


}

public void keyPressed()
 {
    balls.keyPressed();


 }

 

 }
 





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
        size(800, 600);
        balls = new Balls(this);
    }

    // black background
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
    balls.mousePressed();

}



public void mouseReleased()
{
// balls.mouseReleased


}

public void keyPressed()
 {
    // balls.keyPressed();


 }

}



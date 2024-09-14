/*
 * Coder: Allison Hart
 * Date 9/8/2024
 * Description: particle engine part 1 project
 * 
 */


package com.processing.particleEngine;

import processing.core.*;

public class Main extends PApplet {

Ball ball; // a ball that we will draw to the screen



    public static void main(String[] args) {
        PApplet.main("com.processing.particleEngine.Main");
    }

    //setup function - initializes drawing
    public void settings() {
        size(800, 600);
    }

    // black background
    public void setup()
    {
        background(0);
        ball = new Ball(width/2.0f, height*.10f, 50.f, this, color(random(255), random(255), random(255)));
    }


    //draws everything on screen
    public void draw()
    { 

    noStroke();
    ball.draw();

    }

    // will be a way to interacte w/ particles
public void mousePressed()
{



}

    

}



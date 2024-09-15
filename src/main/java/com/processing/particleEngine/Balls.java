/*
 * Coder: Allison Hart
 * Date 9/8/2024
 * Description: particle engine project - ball simulation
 * 
 */


package com.processing.particleEngine;

import java.util.ArrayList;
import processing.core.*;

public class Balls {

    PApplet main; // main class - provides functionality of processing
    ArrayList<Ball> balls;

    Ball ball; //test case ball :)


    Balls(PApplet main_)
    {
        main = main_;
        balls = new ArrayList<Ball>();

    }

    //setup for paricle enhgine
    void setup()
    {
        main.background(0);
        ball = new Ball(main.width/2.0f, main.height*.1f, 3.f, main, main.color(main.random(255), main.random(255), main.random(255))); //f is for type casting float
//.3f makes ball very small
    }

    void draw() // draws the ball
    {
    main.noStroke();
    main.background(0);
    ball.draw();



    }


    void mousePressed()
    {
        ball.faster();


    }


}

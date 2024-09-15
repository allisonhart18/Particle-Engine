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

    Balls(PApplet main_) {
        main = main_;

        balls = new ArrayList<Ball>();
    }
    

    //setup for paricle enhgine
    void setup()
    {
        main.background(255);
        for (int i = 0; i < 1000; i++){
            float x = main.random(main.width);
            float y = main.random(main.height);
            float radius = 10;
            int color = main.color(main.random(255), main.random(255),main.random(255));
            balls.add(new Ball(x,y,radius, main, color));

        }
    }


    void draw() // draws the ball
    {
    main.noStroke();
    main.background(255);

    for(Ball ball :balls){
        ball.draw();
    }

    }


    void mousePressed(float clickX, float clickY) // when mouse is pressed ball goes faster in all directions
    {
        for(Ball ball : balls) {

            ball.faster();
            ball.scatterFrom(clickX, clickY);
        }

    }

    
 

    void mouseReleased() // when mouse is released colors change
    {
        for(Ball ball : balls){

            ball.changeColor();
        }

    }

    void keyPressed() // when s is pressed balls get bigger up to 40 radius
    {
        if(main.key == 's'){
            for(Ball ball : balls){

                ball.changeSize();
            }
        }

    }

    
    

}

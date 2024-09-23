/*
 * Coder: Allison Hart
 * Date 9/8/2024
 * Description: particle engine project - ball simulation
 * 
 */


 package com.final_particle_engine_example;

 import java.util.ArrayList;
 import processing.core.*;
 
 public class Balls {
 
     PApplet main; // main class - provides functionality of processing
     ArrayList<Ball> balls;
 
     Balls(PApplet main_) {
         main = main_;
 
         balls = new ArrayList<Ball>();
     }
     
 
 
     //Ball ball; //test case ball :)
     
 
     //setup for paricle enhgine
     void setup()
     {
         main.background(255);
         for (int i = 0; i < 800; i++){
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
 
 
     void mousePressed() // when mouse is pressed ball goes faster in all directions
     {
         for(Ball ball : balls) {
 
             ball.faster();
         }
        
 
 
     }
 
     
         
 
     
 
     void mouseReleased() // when mouse is released colors change
     {
 
         //ball.released
 
     }
 
     void keyPressed()
     {
 
         // ball.kpress
 
     }
     
 
 }
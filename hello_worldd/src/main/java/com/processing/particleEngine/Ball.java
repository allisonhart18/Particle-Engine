/*
 * Coder: Allison Hart
 * Date 9/8/2024
 * Description: Ball Class - ball that bounces up and down :)
 * 
 */



package com.processing.particleEngine;
import processing.core.*;



public class Ball {
    PApplet main; // the main class - provides funcionality of processing

    int ballColor;  
    float x, y; // loaction of ball
    float radius; //size

Ball(float x_, float y_, float radius_, PApplet main_, int c)
{
    x = x_;
    y = y_;
    radius = radius_;
    ballColor = c;

    main = main_;
}

void draw()
{
    main.fill(ballColor);
    main.ellipse(x,y,radius, radius);

}





}

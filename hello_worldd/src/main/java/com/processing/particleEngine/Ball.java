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
    float yVel =1; // how fast ball moves
    float radius; //size
    float yDirect = 1; //which direction the ball goes - +1 = go down, -1 = go up

Ball(float locX, float locY, float bRadius, PApplet bmain, int c)
{
    x = locX;
    y = locY;
    radius = bRadius;
    ballColor = c;

    main = bmain;
}

void draw()
{
    main.fill(ballColor);
    main.ellipse(x,y,radius, radius);
    move();
}

void move()
{
y+= yVel*yDirect;

if(y> main.height)
{
yDirect =-1;
}

if(y < 0)
{
yDirect = 1;

}

}

void faster()
{

yVel+=4; //+=4 makes it go really fast 


}



}

/*
 * Coder: Allison Hart
 * Date 9/8/2024
 * Description: Ball Class - ball that bounces up and down, changes color, and size :)
 * 
 */



package com.processing.particleEngine;
import processing.core.*;



public class Ball {
    PApplet main; // the main class - provides funcionality of processing

    int ballColor;  
    float x, y; // loaction of ball
    float yVel = 0; // how fast ball moves
    float xVel = 0; // how fast moves on x
    float xDirect = 1; // direction ball goes in on x axis
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

void move() // moves balls and keeps them within screen
{
    x += xVel;
    y += yVel;

    // Ensure the ball stays within the window boundaries
    if (x < radius / 2) {
        x = radius / 2;
        xVel *= -1; // Reverse direction when hitting the boundary
    }
    if (x > main.width - radius / 2) {
        x = main.width - radius / 2;
        xVel *= -1; // Reverse direction when hitting the boundary
    }
    if (y < radius / 2) {
        y = radius / 2;
        yVel *= -1; // Reverse direction when hitting the boundary
    }
    if (y > main.height - radius / 2) {
        y = main.height - radius / 2;
        yVel *= -1;
}

}

void faster()
{

yVel+=2; //+=4 makes it go really fast 
xVel +=2; // makes ball go fast on x

}

void scatterFrom(float clickX, float clickY) {
    float dx = x - clickX;
    float dy = y - clickY;
    float distance = PApplet.dist(x, y, clickX, clickY);
    if (distance > 0) {
        // Normalize direction and set velocity
        xVel = dx / distance * 5; // Scale factor for velocity
        yVel = dy / distance * 5; // Scale factor for velocity
    }
}

void changeColor() // changes color randomly - call in balls class
{
ballColor = main.color(main.random(255), main.random(255), main.random(255));

}

void changeSize() // size of ball chnages up to radius of 40 abd reset to 10
{
radius += 10;
if(radius >40){

    radius = 10;
}
}



}

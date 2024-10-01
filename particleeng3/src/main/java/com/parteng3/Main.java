/*
 * Coder: Allison Hart
 * 9/30/2024
 * Main class - calls from the controller class and makes sure everything run
 * 
 * How to Play Game :) (attempt at extra credit)
 * 
 * drage the shapes into the rectangle - circles are grabbed from the middle, triangles from theri top point, and square from their top left point
 *  pressing r,g,b changes colors of different shapes, when you click on specific shapes they change color 
 * 
 * 
 */

package com.parteng3;

import processing.core.PApplet;

public class Main extends PApplet {
    Controller controller;

    public static void main(String[] args) {
        PApplet.main("com.parteng3.Main");
    }

    public void settings() {
        size(800, 600);
    }

    public void setup() {
        controller = new Controller(this);
    }

    public void draw() {
        background(255);  // Clear the screen
        controller.update();  // Updates the current state logic
        controller.display();
        controller.keyPressed(); // Renders the current state visuals
    }

    public void mousePressed() {
        controller.mousePressed();
    }

    public void mouseDragged() {
        controller.mouseDragged();
    }

    public void mouseReleased() {
        controller.mouseReleased();
    }
    public void keyPressed() {
        controller.keyPressed();
    }
}

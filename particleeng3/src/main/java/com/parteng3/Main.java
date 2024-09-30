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
}

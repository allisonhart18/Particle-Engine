package com.parteng3;

import processing.core.PApplet;

abstract class GameState {
    PApplet main;

    GameState(PApplet main) {
        this.main = main;
    }

    abstract void update();
    abstract void mouseClicked();
    abstract void keyPressed();
    abstract void mousePressed();
    abstract void display();
    abstract void mouseDragged();
    abstract void mouseReleased();

}

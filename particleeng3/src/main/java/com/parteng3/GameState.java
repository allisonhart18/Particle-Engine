/*
 * Coder: Allison Hart
 * 9/30/2024
 * GameState class - abstract class called in playState class
 * 
 * 
 */

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

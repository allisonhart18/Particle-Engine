package com.parteng3;

import processing.core.PApplet;

public class Controller {
    PApplet main;
    GameState currentState;
    GameState playState;
    GameState mainMenuState;
    GameState gameOverState;

    public Controller(PApplet main) {
        this.main = main;
        playState = new PlayState(main, this);
        mainMenuState = new MainMenuState(main, this);
        gameOverState = new GameOverState(main, this);
        currentState = mainMenuState;  // Start with main menu
    }

    public void update() {
        currentState.update();
    }

    public void display() {
        currentState.display();
    }

    public void setState(GameState state) {
        currentState = state;
    }

    // Add these methods to forward the mouse events to the current state
    public void mousePressed() {
        currentState.mousePressed();
    }

    public void mouseDragged() {
        currentState.mouseDragged();
    }

    public void mouseReleased() {
        currentState.mouseReleased();
    }

    public void keyPressed(){
        currentState.keyPressed();
    }
}

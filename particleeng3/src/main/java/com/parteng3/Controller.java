/*
 * Coder: Allison Hart
 * 9/30/2024
 * Controller class - main manager for handeling different game states
 * and user interactions
 * 
 */


package com.parteng3;

import processing.core.PApplet;

public class Controller {
    PApplet main;
    GameState currentState;
    GameState playState;
    GameState mainMenuState;
    GameState gameOverState;

    // Track if the game is over
     boolean isGameOver = false;

    public Controller(PApplet main) {
        this.main = main;
        playState = new PlayState(main, this);
        mainMenuState = new MainMenuState(main, this);
        gameOverState = new GameOverState(main, this);
        currentState = mainMenuState;  // Start with main menu
    }

    public void update() {
        if (!isGameOver) {
            currentState.update();
        }
    }

    public void display() {
        if (!isGameOver) {
            currentState.display();
        }
    }

    public void setState(GameState state) {
        currentState = state;

        // Check if the new state is GameOverState and set the flag
        if (state instanceof GameOverState) {
            isGameOver = true;
        } else {
            isGameOver = false;
        }
    }
    //

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

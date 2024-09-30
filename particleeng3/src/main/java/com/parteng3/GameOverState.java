package com.parteng3;
import processing.core.PApplet;
import processing.core.PConstants;

class GameOverState extends GameState {
    Controller controller;  // Add a reference to the Controller

    GameOverState(PApplet main, Controller controller) {
        super(main);
        this.controller = controller;  // Assign the controller
    }

    void update() {
        main.textSize(32);
        main.fill(0);
        main.text("Game Over - Press Enter to Restart", 150, 300);
    }

    void mouseClicked() {
        // No specific action on mouse click for this state
    }

    void keyPressed() {
        if (main.key == PConstants.ENTER) {
            controller.setState(controller.mainMenuState);  // Transition to MainMenuState
        }
    }

    @Override
    void mousePressed() {
        
    }

    @Override
    void display() {
       
    }

    @Override
    void mouseDragged() {
        
    }

    @Override
    void mouseReleased() {
        
    }
}

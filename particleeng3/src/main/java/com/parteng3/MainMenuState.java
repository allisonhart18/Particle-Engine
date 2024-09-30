package com.parteng3;

import processing.core.PApplet;
import processing.core.PConstants;

class MainMenuState extends GameState {
    Controller controller;  // Reference to the Controller

    MainMenuState(PApplet main, Controller controller) {
        super(main);
        this.controller = controller;  // Assign the controller
    }

    void update() {
        main.textSize(32);
        main.fill(0);
        main.text("Main Menu - Press Enter to Play", 150, 300);
    }

    void mouseClicked() {
        // No specific action on mouse click for this state
    }

    void keyPressed() {
        if (main.key == PConstants.ENTER) {
            controller.setState(controller.playState);  // Transition to PlayState
        }
    }

    //@Override
    void mousePressed() {
       
    }

    //@Override
    void display() {
    }

    //@Override
    void mouseDragged() {
        
    }

   // @Override
    void mouseReleased() {
        
    }
}

package com.parteng3;

import processing.core.PApplet;
import java.util.ArrayList;

class PlayState extends GameState {
    ArrayList<Particle> particles;
    int score;
    float boxX, boxY, boxSize; // Drop box properties

    PlayState(PApplet main, Controller controller) {
        super(main);
        particles = new ArrayList<>();

        // Initialize particles
        for (int i = 0; i < 5; i++) {
            particles.add(new circleSprinkle(main, main.random(main.width), main.random(main.height), main.random(-2, 2), main.random(-2, 2), 20, main.color(255, 0, 0)));
            particles.add(new squareSprinkle(main, main.random(main.width), main.random(main.height), main.random(-2, 2), main.random(-2, 2), 20, main.color(0, 255, 0)));
            particles.add(new triangleSprinkle(main, main.random(main.width), main.random(main.height), main.random(-2, 2), main.random(-2, 2), 20, main.color(0, 0, 255)));
        }
        score = 0;

        // Initialize drop box properties
        boxX = 50; // X position of the drop box
        boxY = 50; // Y position of the drop box
        boxSize = 100; // Size of the drop box
    }

    @Override
    void update() {
        for (Particle p : particles) {
            p.move();
            p.display();
        }

        // Draw the drop box
        main.fill(200, 200, 255); // Light blue color for the box
        main.rect(boxX, boxY, boxSize, boxSize);

        // Display the current score
        main.fill(0);
        main.textSize(20);
        main.text("Score: " + score, 10, 30);
    }

    @Override
    void mousePressed() {
        for (Particle p : particles) {
            p.mousePressed(); // Check for mouse press on particles
        }
    }

    @Override
    void mouseDragged() {
        for (Particle p : particles) {
            p.mouseDragged(); // Update particles during dragging
        }
    }

    @Override
    void mouseReleased() {
        for (Particle p : particles) {
            // Check if the particle is inside the box before ending the drag
            if (p.isDragging && isInsideBox(p)) {
                score += 10; // Award points
            }
            p.mouseReleased(); // Stop dragging after the check
        }
    }

    @Override
    void mouseClicked() {
        // Not used in PlayState, can leave empty or implement if needed
    }

    @Override
    void keyPressed() {
        // Not used in PlayState, can leave empty or implement if needed
    }

    @Override
    void display() {
        // The display method is handled in the update method
        // You can implement any additional display logic here if needed
    }

    // Helper method to check if a particle is inside the drop box
    boolean isInsideBox(Particle p) {
        return p.x > boxX && p.x < boxX + boxSize && p.y > boxY && p.y < boxY + boxSize;
    }
}

package com.parteng3;

//iam theocder 




package com.parteng3;

import processing.core.PApplet;
import java.util.ArrayList;

public class Main extends PApplet{
    
    ArrayList<Particle> particles = new ArrayList<>(); // arraylist to create multiple sprinkles

    public static void main(String[] args) {
        PApplet.main("com.parteng3.Main");
    }

   
public void settings() {
    size(800, 600);
    
}


public void setup() {
    // Create instances of each particle subclass
    for (int i = 0; i < 25; i++) {
        particles.add(new circleSprinkle(this, random(width), random(height), random(-2, 2), random(-2, 2), 20, color(255, 0, 0))); 
        particles.add(new squareSprinkle(this, random(width), random(height), random(-2, 2), random(-2, 2), 20, color(0, 255, 0)));
        particles.add(new triangleSprinkle(this, random(width), random(height), random(-2, 2), random(-2, 2), 20, color(0, 0, 255))); 
    }
}

public void draw() {
    background(255);
    for (Particle p : particles) {
        p.move();
        p.display();
    }

    // Handles collision for triangleSprinkle
    for (int i = 0; i < particles.size(); i++) {
        if (particles.get(i) instanceof triangleSprinkle) {
            for (int j = i + 1; j < particles.size(); j++) {
                if (particles.get(j) instanceof triangleSprinkle) {
                    triangleSprinkle tp1 = (triangleSprinkle) particles.get(i);
                    triangleSprinkle tp2 = (triangleSprinkle) particles.get(j);
                    if (tp1.checkCollision(tp2)) {
                        tp1.vx *= -1;
                        tp1.vy *= -1;
                        tp2.vx *= -1;
                        tp2.vy *= -1;
                    }
                }
            }
        }
    }
   
}

public void mouseClicked() { // mouseclicked function
    for (Particle p : particles) {
        p.mouseClicked();
    }
}

 public void keyPressed() { // keypressed function
    for (Particle p : particles) {
        p.keyPressed();
    }
}








}
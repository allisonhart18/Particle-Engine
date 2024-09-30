package com.parteng3;

import processing.core.PApplet;

class squareSprinkle extends Particle {
    squareSprinkle(PApplet main, float x, float y, float vx, float vy, float size, int color) {
        super(main, x, y, vx, vy, size, color);
    }

    @Override
    void display() {
        main.fill(color);
        main.rect(x, y, size+25, size+25); // Draw square
    }
}

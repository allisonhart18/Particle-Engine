package com.parteng3;

import processing.core.PApplet;

class triangleSprinkle extends Particle {
    triangleSprinkle(PApplet main, float x, float y, float vx, float vy, float size, int color) {
        super(main, x, y, vx, vy, size, color);
    }

    @Override
    void display() {
        main.fill(color);
        main.triangle(x, y, x - 25, y + 25, x + 25, y + 25); // Draw triangle
    }
}

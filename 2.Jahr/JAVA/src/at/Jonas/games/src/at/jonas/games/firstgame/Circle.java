package at.jonas.games.firstgame;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Circle implements Actor{
    private float x,y;
    private float speed;
    private int diameter;
    private Random random;

    public Circle(float x, float y, float speed, int diameter) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.diameter = diameter;
    }

    @Override
    public void update(int delta) {
        this.y+= (float)delta/this.speed;
        if (this.y > 600){
            this.y = 0;
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y, diameter,diameter );
    }
}

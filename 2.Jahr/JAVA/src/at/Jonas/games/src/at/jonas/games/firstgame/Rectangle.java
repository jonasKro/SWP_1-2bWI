package at.jonas.games.firstgame;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Rectangle implements Actor{
    private float x;
    private float y;
    private float speed;
    private Random random;

    public Rectangle(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }


    public void render (Graphics graphics){

        graphics.drawRect(this.x,this.y, 50, 50);

    }

    public void update(int delta){
        random = new Random();
        this.x+= (float)delta/this.speed;
        if (this.x > random.nextInt(800)+800){
            this.x = 0;
        }
    }

}

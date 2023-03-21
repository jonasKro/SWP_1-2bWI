package at.jonas.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangle extends BasicGame {
    private float x;
    private float y;
    private float speed;
    private boolean goingLeft;
    private float rectX;
    private float rectY;
    private boolean rectMovingVert;
    private boolean rectMovingHor;

    public Rectangle(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 110;
        this.y = 100;
        this.rectX = 200;
        this.rectY = 200;
        this.speed = 3;
        this.goingLeft = false;
        this.rectMovingVert = true;
        this.rectMovingHor = false;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if ((int)this.x== 600){
            goingLeft = true;
        }
        if ((int)this.x== 100){
            goingLeft = false;
        }

        if (goingLeft){
            this.x-= (float)delta/speed;

        }
        if (!goingLeft){
            this.x+= (float)delta/speed;

        }

        if ((int)this.rectX== 600){
            rectMovingVert = true;
        }
        if ((int)this.rectX== 100){
            rectMovingVert = false;
        }

        if (rectMovingVert && rectMovingHor){
            this.rectX-= (float)delta/speed;
            System.out.println("moving left");
        }
        if (!rectMovingVert && !rectMovingHor){
            this.rectX+= (float)delta/speed;
            System.out.println("moving right");
        }
        //------------------------------------------
        if ((int)this.rectY== 400){
            rectMovingHor = true;
        }
        if ((int)this.rectY== 200){
            rectMovingHor = false;
        }

        if (rectMovingHor && !rectMovingVert){
            this.rectY-= (float)delta/speed;
            System.out.println("moving up");
        }
        if (!rectMovingHor && rectMovingVert){
            this.rectY+= (float)delta/speed;
            System.out.println("moving down");
        }



    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawOval(this.x,20,200,100);
        graphics.drawRect(this.rectX,this.rectY,100,100);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangle("REKTANGEL"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

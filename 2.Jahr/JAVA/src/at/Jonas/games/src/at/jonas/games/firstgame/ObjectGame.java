package at.jonas.games.firstgame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectGame extends BasicGame {
        Random random = new Random();
        List<Actor> actors;

    public ObjectGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        float y = 50;
        float x = 50;
        for (int i = 0; i < 50; i++) {

            Rectangle rectangle = new Rectangle((float) random.nextInt(300),y,(float) random.nextInt(5)+1 );
            this.actors.add(rectangle);
            y+=50;
        }
        for (int i = 0; i < 50; i++) {

            Circle circle = new Circle(x,(float) random.nextInt(300),(float) random.nextInt(5)+1, random.nextInt(50) );
            this.actors.add(circle);
            x+=50;
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor:actors) {
            actor.update(delta);
        }

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor:actors) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectGame("REKTANGEL"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

package at.jonas.games.firstgame;

import org.newdawn.slick.Graphics;

public interface Actor {

    public default void update(int delta){

    }

    public default void render(Graphics graphics){

    }
}

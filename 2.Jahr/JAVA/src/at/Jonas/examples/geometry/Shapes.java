package at.Jonas.examples.geometry;
import java.util.ArrayList;

public class Shapes {
    private ArrayList<Circle> circles;
    private ArrayList<Square> squares;
    private ArrayList<Rectangle> rectangles;

    public Shapes(Circle circles, Square squares, Rectangle rectangles) {
        this.circles.add(circles);
        this.squares.add(squares);
        this.rectangles .add(rectangles);
    }

    public ArrayList<Circle> getCircles() {
        return circles;
    }

    public void addCircles(Circle circles) {
        this.circles.add(circles);
    }

    public ArrayList<Square> getSquares() {
        return squares;
    }

    public void addSquares(Square squares) {
        this.squares.add(squares);
    }

    public ArrayList<Rectangle> getRectangles() {
        return rectangles;
    }

    public void addRectangles(Rectangle rectangles) {
        this.rectangles.add(rectangles);
    }

    public void getAreas(){
        for (int i = 0; i< this.squares.size();i++){
            System.out.println(this.squares.get(i).getArea());
        }
        for (int i = 0; i< this.circles.size();i++){
            System.out.println(this.circles.get(i).getArea());
        }
        for (int i = 0; i< this.rectangles.size();i++){
            System.out.println(this.rectangles.get(i).getArea());
        }

    }
}

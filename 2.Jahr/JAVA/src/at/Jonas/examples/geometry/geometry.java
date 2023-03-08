package at.Jonas.examples.geometry;

public class geometry {
    public static void main(String[] args){
        Square s1 = new Square(2);
        Circle c1 = new Circle(3);
        Rectangle r1 = new Rectangle(2,6);
        c1.getArea();
        Shapes shape = new Shapes(c1,s1,r1);
        shape.addCircles(c1);
        shape.getAreas();





    }
}

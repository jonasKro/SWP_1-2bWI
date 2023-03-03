package at.Jonas.examples.geometry;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void getArea(){
        double A =0;
        A = this.radius * Math.PI;
        System.out.println(A);
    }
}



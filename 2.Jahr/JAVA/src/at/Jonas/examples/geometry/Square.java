package at.Jonas.examples.geometry;

public class Square {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getArea(){
        int A = a*a;
        return A;
    }
}

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

    public void getArea(){
        int A = a*a;
        System.out.println(A);
    }
}

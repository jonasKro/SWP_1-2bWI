package at.Jonas.examples.calculator;

public class Calculator {
    private double a;
    private double b;

    public Calculator(double a,double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void add(){
        double res = this.a + this.b;
        System.out.println(res);
    }
    public void subtract(){
        double res = this.a - this.b;
        System.out.println(res);
    }
    public void multiply(){
        double res = this.a * this.b;
        System.out.println(res);
    }
    public void divide(){
        double res = this.a / this.b;
        System.out.println(res);
    }
}

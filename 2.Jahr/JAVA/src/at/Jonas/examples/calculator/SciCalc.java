package at.Jonas.examples.calculator;

public class SciCalc extends Calculator{


    public SciCalc(double a, double b) {
        super(a, b);
    }
    public void cos(double i){
        double res = Math.cos(i*Math.PI/180);
        System.out.println(res);
    }
    public void sin(double i){
        double res = Math.sin(i*Math.PI/180);
        System.out.println(res);
    }
}

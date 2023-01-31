package at.Jonas.examples.calculator;

public class RootCalc extends Calculator{
    public RootCalc(double a, double b) {
        super(a, b);
    }
    public void sqrt(double i){
        double res = Math.sqrt(i);
        System.out.println(res);
    }
}

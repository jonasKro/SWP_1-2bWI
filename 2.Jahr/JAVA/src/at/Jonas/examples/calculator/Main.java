package at.Jonas.examples.calculator;

public class Main {
    public static void main(String[] args){
        Calculator c1 = new Calculator(3,6);
        c1.add();
        c1.subtract();
        c1.multiply();
        c1.divide();
        SciCalc sc1 = new SciCalc(3,6);
        sc1.cos(45);
        sc1.sin(180);
        RootCalc rc1 = new RootCalc(1 ,3);
        rc1.sqrt(144);
    }
}

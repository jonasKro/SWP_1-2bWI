package at.Jonas.examples.cars;

public class Main {
    public static void main(String[] args){
        Manufacturer m1 = new Manufacturer("Merkedes", "Itlaien", 12);
        Motor mot1 = new Motor(Motor.fuel.Diesel, 50);
        Car c1 = new Car("blue",180, 500000, 5, 30000);
        c1.setManufacturer(m1);
        c1.setMotor(mot1);
        m1.setSale(20);
        System.out.println(c1.getManufacturer().getSale());
        c1.getPrice();
        c1.drive(1000);
        c1.getKilometres_driven();
    }
}

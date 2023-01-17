package at.Jonas.examples.cars;

public class Car {
    private Motor motor;
    private Manufacturer manufacturer;
    private String color;
    private int max_speed;
    private int price_base;
    private int fuel_consumption;
    private int kilometres_driven;

    public Car(String color, int max_speed, int price_base, int fuel_consumption, int kilometres_driven) {
        this.color = color;
        this.max_speed = max_speed;
        this.price_base = price_base;
        this.fuel_consumption = fuel_consumption;
        this.kilometres_driven = kilometres_driven;
    }

    public void getPrice(){
        float price;
        price = price_base - (manufacturer.getSale() * price_base);
        System.out.println("this car costs "+price+"€");
    }
    public void drive(int kilometres){
        kilometres_driven += kilometres;
        if(kilometres_driven > 50000){
            this.fuel_consumption *= 1.091;
        }
        float fuel_fuel = this.fuel_consumption*kilometres;
            System.out.println("du hast "+ fuel_fuel+"l Benzin verbraucht");
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public int getPrice_base() {
        return price_base;
    }

    public void setPrice_base(int price_base) {
        this.price_base = price_base;
    }

    public int getFuel_consumption() {
        return fuel_consumption;
    }

    public void setFuel_consumption(int fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
    }

    public int getKilometres_driven() {
        return kilometres_driven;
    }

    public void setKilometres_driven(int kilometres_driven) {
        this.kilometres_driven = kilometres_driven;
    }
}

package at.Jonas.examples.cars;

public class Motor {
    public enum fuel{Diesel,Gas};
    private fuel fueltype;
    private int horsepower;

    public Motor(fuel fueltype, int horsepower) {
        this.fueltype = fueltype;
        this.horsepower = horsepower;
    }

    public fuel getFueltype() {
        return fueltype;
    }

    public void setFueltype(fuel fueltype) {
        this.fueltype = fueltype;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}

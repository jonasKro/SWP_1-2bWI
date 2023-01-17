package at.Jonas.examples.cars;

public class Manufacturer {
    private String name;
    private String country;
    private float sale;

    public Manufacturer(String name, String country, int sale) {
        this.name = name;
        this.country = country;
        this.sale = sale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getSale() {
        return sale;
    }

    public void setSale(float sale) {
        this.sale = sale/100;
    }
}

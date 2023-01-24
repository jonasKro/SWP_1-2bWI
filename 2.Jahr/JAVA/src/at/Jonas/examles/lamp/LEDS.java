package at.Jonas.examles.lamp;

public class LEDS {
    private String name;
    private String color;
    private int powerintake;
    private boolean isOn;


    public LEDS(String name, String color, int powerintake, boolean isOn) {
        this.name = name;
        this.color = color;
        this.powerintake = powerintake;
        this.isOn = isOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPowerintake() {
        return powerintake;
    }

    public void setPowerintake(int powerintake) {
        this.powerintake = powerintake;
    }

    public void turnOff() {
         isOn = false;
        System.out.println("this led is off");
    }

    public boolean turnOn() {
        if (!isOn){
            isOn = true;
            this.powerintake += 5;
            System.out.println(this.getName() + " is now on:" );
            return isOn;
        }else{
            System.out.println(this.getName() + " is already on:");
            return isOn;
        }
    }
    public boolean getStatus() {
        return isOn;
    }

}


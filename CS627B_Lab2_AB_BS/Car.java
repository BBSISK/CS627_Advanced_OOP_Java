package CS627B_Lab2_AB_BS; 

public class Car {
    private String make;
    private String carReg;
    private int cost;
    private String colour;

    public Car(String make, String carReg, int cost , String colour
    ) {
        this.make = make;
        this.carReg = carReg;
        this.cost = cost;
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public String getCarReg() {
        return carReg;
    }

    public int getCost() {
        return cost;
    }

    public String getColour() {
        return colour;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setCarReg(String carReg) {
        this.carReg = carReg;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }


    @Override
    public String toString() {
        return carReg + " " + make + " " + cost + " " + colour;
    }
}
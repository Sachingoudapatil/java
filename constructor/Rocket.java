public class Rocket {
    private String country;
    private double speed;
    private double fuelCapacity;
    private int noOfThrusters;

    
    public Rocket() {
        this.country = "DefaultCountry";
        this.speed = 0.0;
        this.fuelCapacity = 0.0;
        this.noOfThrusters = 0;
    }

   
    public Rocket(String country, double speed, double fuelCapacity, int noOfThrusters) {
        this.country = country;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.noOfThrusters = noOfThrusters;
    }

    
    public void setCountry(String country) {
        this.country = country;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setNoOfThrusters(int noOfThrusters) {
        this.noOfThrusters = noOfThrusters;
    }

    
    public void printDetails() {
        System.out.println("Country: " + country + ", Speed: " + speed + ", Fuel Capacity: " + fuelCapacity + ", No of Thrusters: " + noOfThrusters);
    }
} 

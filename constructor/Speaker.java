public class Speaker {
    private String brand;
    private String size;
    private double cost;
    private int output;

    public Speaker() {
        this.brand = "DefaultBrand";
        this.size = "DefaultSize";
        this.cost = 0.0;
        this.output = 0;
    }

 
    public Speaker(String brand, String size, double cost, int output) {
        this.brand = brand;
        this.size = size;
        this.cost = cost;
        this.output = output;
    }

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    
    public void printDetails() {
        System.out.println("Brand: " + brand + ", Size: " + size + ", Cost: " + cost + ", Output: " + output);
    }
} 

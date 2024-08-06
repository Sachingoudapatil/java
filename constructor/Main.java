public class Main {
    public static void main(String[] args) {
        
        Speaker speaker1 = new Speaker();
        Speaker speaker2 = new Speaker("Sony", "Medium", 150.75, 50);
        Speaker speaker3 = new Speaker();
        speaker3.setBrand("Bose");
        speaker3.setSize("Large");
        speaker3.setCost(299.99);
        speaker3.setOutput(100);

        
        System.out.println("Speaker 1 Details:");
        speaker1.printDetails();
        System.out.println("Speaker 2 Details:");
        speaker2.printDetails();
        System.out.println("Speaker 3 Details:");
        speaker3.printDetails();

        
        Rocket rocket1 = new Rocket();
        Rocket rocket2 = new Rocket("USA", 25000.0, 5000.0, 4);
        Rocket rocket3 = new Rocket();
        rocket3.setCountry("Russia");
        rocket3.setSpeed(30000.0);
        rocket3.setFuelCapacity(6000.0);
        rocket3.setNoOfThrusters(6);

        
        System.out.println("Rocket 1 Details:");
        rocket1.printDetails();
        System.out.println("Rocket 2 Details:");
        rocket2.printDetails();
        System.out.println("Rocket 3 Details:");
        rocket3.printDetails();

        
        Chocolate chocolate1 = new Chocolate();
        Chocolate chocolate2 = new Chocolate("Cadbury", 1.99, "Milk", "Medium");
        Chocolate chocolate3 = new Chocolate();
        chocolate3.setBrand("Lindt");
        chocolate3.setPrice(2.49);
        chocolate3.setFlavour("Dark");
        chocolate3.setSize("Small");

      
        System.out.println("Chocolate 1 Details:");
        chocolate1.printDetails();
        System.out.println("Chocolate 2 Details:");
        chocolate2.printDetails();
        System.out.println("Chocolate 3 Details:");
        chocolate3.printDetails();

        
        Projector projector1 = new Projector();
        Projector projector2 = new Projector("Epson", "LCD", "White", 2.5);
        Projector projector3 = new Projector();
        projector3.setCompany("BenQ");
        projector3.setType("DLP");
        projector3.setColor("Black");
        projector3.setWeight(3.0);

      
        System.out.println("Projector 1 Details:");
        projector1.printDetails();
        System.out.println("Projector 2 Details:");
        projector2.printDetails();
        System.out.println("Projector 3 Details:");
        projector3.printDetails();

        
        Paper paper1 = new Paper();
        Paper paper2 = new Paper(0.5, "A4", "High", "White");
        Paper paper3 = new Paper();
        paper3.setThickness(0.3);
        paper3.setSize("A3");

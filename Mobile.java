public class Mobile {
   
    public static String brand;
    private String model;

   
    public Mobile(String model) {
       
        this.model = model;
    }

    public static String getBrand() {
        return brand;
    }

    public void displayInfo() {
      
        System.out.println("Brand: " + brand + ", Model: " + model);
    }

    public static void main(String[] args) {
       
        Mobile.brand = "Apple";

  
        Mobile m1 = new Mobile("iPhone 14");
        Mobile m2 = new Mobile("iPhone 13");
        Mobile m3 = new Mobile("iPhone 12");

        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();
      
      
    }
}

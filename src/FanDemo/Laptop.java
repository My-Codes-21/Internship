package FanDemo;

public class Laptop {
    String brand;
    String model;
    String ramSize;
    String processor;

    Laptop(){
        brand = "Dell";
        model = "Inspiron 15";
        ramSize ="8";
        processor = "i9";
    }
    void displayInfo(){
        System.out.println("Brand :"+ brand);
        System.out.println("Brand :"+ model);
        System.out.println("Brand :"+ ramSize);
        System.out.println("Brand :"+ processor);
    }
}

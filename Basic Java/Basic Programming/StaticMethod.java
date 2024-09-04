class Mobile{
    String brand; // Instance variables
    int price; // Instance variables
    static String name; // Static variable (class variable)

    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }

    public static void show1(Mobile obj){
        // System.out.println(brand + " " + price); // Cannot access instance variables in static method
        System.out.println(obj.brand + " " + obj.price); // Can access instance variables using object reference
        System.out.println(name); // Can access static variables in static method 
        System.out.println("In static method");
    }
}

public class StaticMethod {
    public static void main(String[] args) { // If main method is not static, JVM cannot call it directly
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;


        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}

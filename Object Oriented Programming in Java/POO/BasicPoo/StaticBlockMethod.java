package POO.BasicPoo;
class Mobile{
    String brand; // Instance variables
    int price; // Instance variables
    static String name; // Static variable (class variable)

    // The class is loaded only once to the classs loader then the objecs are instantiated
    // Every time you load a class the static block will be called

    static{ // Static block will be called only once, will be called before constructor
        name = "Phone";
        System.out.println("In static block");
    }

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }
}

class StaticBlockMethod{
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile"); // Load the class
        
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // Mobile.name = "SmartPhone";

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 1700;


        // obj1.show();
        // obj2.show();
    }
}
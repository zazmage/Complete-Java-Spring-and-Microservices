package POO.BasicPoo;
class Mobile{
    String brand; // Instance variables
    int price; // Instance variables
    static String name; // Static variable (class variable)

    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }
}

class StaticKeyword {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        obj2.name = "SmartPhone";

        obj1.name = "Phone"; // Static variable is shared among all objects
        Mobile.name = "Mobile"; // Static variables should be accessed using class name

        obj1.show();
        obj2.show();
    }
}
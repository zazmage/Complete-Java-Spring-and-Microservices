abstract class Car{ // Abstract class
    public abstract void drive(); // Abstract method

    public abstract void fly();

    // an abstract class can have non-abstract methods, it can't even have abstract methods
    
    public void playMusic(){
        System.out.println("Play Music");
    }
}

// The class that extends the abstract class must implement the abstract method
class WagonR extends Car{ 
    public void drive(){ // Overriding the abstract method
        System.out.println("WagonR is driving");
    }
    public void fly(){
        System.out.println("WagonR is flying");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        
        // Car obj = new Car(); // Error: Car is abstract; cannot be instantiated
        Car obj = new WagonR(); // Upcasting
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}

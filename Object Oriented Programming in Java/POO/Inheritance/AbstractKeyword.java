abstract class Car{ // Abstract class
    public abstract void drive(); // Abstract method

    public abstract void fly();

    // an abstract class can have non-abstract methods, it can't even have abstract methods
    
    public void playMusic(){
        System.out.println("Play Music");
    }
}

// The class that extends the abstract class must implement the abstract method, unless it is also an abstract class
abstract class WagonR extends Car{ 
    public void drive(){ // Overriding the abstract method
        System.out.println("WagonR is driving");
    }
}

// Concrete class
class updateWagonR extends WagonR{ 
    public void fly(){
        System.out.println("WagonR is flying");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        
        // Car obj = new Car(); // Error: Car is abstract; cannot be instantiated
        Car obj = new updateWagonR(); // Upcasting
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}

// Poly: many, morphism: forms / Behavior
// The same object can be treated as different types of objects
// Two types of polymorphism: Compile-time polymorphism and Run-time polymorphism
// Early binding: Compile-time polymorphism
// Late binding: Run-time polymorphism
// Compile-time: If your behavior is defined at compile time, then it is called compile-time polymorphism
// Run-time: If your behavior is defined at run time, then it is called run-time polymorphism
// Overloading: Compile-time polymorphism (Method overloading) 
// Overriding: Run-time polymorphism (Method overriding)


class A{
    public void show(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("In C show");
    }
}

class D extends C{
    public void show(){
        System.out.println("In D show");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        A obj = new B(); // Upcasting, the object of subclass is referred by the superclass reference variable
        obj.show(); // In B show

        A obj2 = new A();
        obj2.show(); // In A show

        obj2 = new B();
        obj2.show(); // In B show

        obj2 = new C();
        obj2.show(); // In C show

        obj2 = new D();
        obj2.show(); // In D show

    }
}

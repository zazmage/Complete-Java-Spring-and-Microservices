import POO.BasicPoo.A;

class A extends Object{ // Every class in java extends from the Object class
    public A(){ 
        super();
        System.out.println("In A");
    }
    public A(int n){
        super();
        System.out.println("In A int");
    }
}

class B extends A{
    public B(){
        // Every constructor has a super() method by default even if you don't write it
        super(); // Call the constructor of a super class, in this case A
        System.out.println("In B");
    }

    public B(int n){
        super(n); // It calls the parametrized constructor in the super class.
        System.out.println("In B int");
    }

    public B(double n){
        this(); // This will excecute the constructor of the same class
        System.out.println("In B double");
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        B obj = new B();
        B obj1 = new B(5);
    }
}

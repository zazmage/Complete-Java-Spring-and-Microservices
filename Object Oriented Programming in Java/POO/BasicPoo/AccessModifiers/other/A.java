package other;

class Launch{
    public void abc(){
        A obj = new A();
        System.out.println(obj.marks2);
    }
}

public class A {
    public int marks = 6; // public: can be accessed from anywhere
    protected int marks2 = 7; // protected: can be accessed within the same package and subclasses

    public void show() {
        System.out.println(marks);
    }
}

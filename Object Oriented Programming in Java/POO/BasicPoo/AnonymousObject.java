package POO.BasicPoo;
class A{
    public A(){
        System.out.println("Object created");
    }
    public void show(){
        System.out.println("In A show");
    }
}
public class AnonymousObject {
    public static void main(String[] args) {
        int marks;
        marks = 99;
        A obj; // Reference creation
        obj = new A(); // obj is a reference variable. This is where you create the object.
        obj.show();

        new A(); // Anonymous object, created in the heap but not in stack.
        new A().show(); // We call that object only when is required, but we don't store it in a reference variable.
    }
}

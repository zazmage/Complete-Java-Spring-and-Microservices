import other.A;

class C extends A {
    public void abc() {
        System.out.println(marks2);
    }

}

public class AccessModifiers {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.marks);
        obj.show();

        B obj2 = new B();
        System.out.println(obj2.marks);
    }
}

class A{
    public void show1(){
        System.out.println("In A Show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In B Show");
    }
}

public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        double d = 4.5;
        int i = (int)d; // Type casting

        System.out.println(d); // Output: 4.5
        System.out.println(i); // Output: 4


        A obj = (A) new B(); // Upcasting
        obj.show1(); // Output: In A Show

        // obj.show2(); // Error: cannot find symbol

        B obj1 = (B) obj; // Downcasting
        obj1.show2(); // Output: In B Show
    }
}

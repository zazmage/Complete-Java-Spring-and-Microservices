package POO.BasicPoo;
// Stack Last in First Out
// Heap open memory space

class Calculator {
    int num = 5; // Instance variable

    // Every method has its own stack memory
    public int add(int a, int b) { // a, b are local variables
        System.out.println(num); 
        return a + b;
    }
}

public class StackAndHeap {
    public static void main(String[] args) {
        int data = 10;
        Calculator obj = new Calculator(); // obj is a reference variable and it is stored in stack memory. new Calculator() is stored in heap memory
        Calculator obj1 = new Calculator();
        int r1 = obj.add(10, 20); 
        System.out.println("Result 1: " + r1);

        obj1.num = 8;
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add(10, 20);
        System.out.println("Result 1: " + r1);
    }
}

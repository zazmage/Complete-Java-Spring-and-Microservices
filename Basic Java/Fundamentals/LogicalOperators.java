package Fundamentals;
public class LogicalOperators {
    public static void main(String[] args) {
        // Logical Operators
        // &&, ||, !
        // AND, OR, NOT
        // AND
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // OR
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // NOT
        System.out.println(!true); // false
        System.out.println(!false); // true

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println(a < b && c < d); // true
        System.out.println(a < b && c > d); // false
        System.out.println(a > b && c < d); // false
        System.out.println(a > b && c > d); // false

        System.out.println(a < b || c < d); // true
        System.out.println(a < b || c > d); // true
        System.out.println(a > b || c < d); // true
        System.out.println(a > b || c > d); // false

        System.out.println(!(a < b)); // false
        System.out.println(!(a > b)); // true
    }
}

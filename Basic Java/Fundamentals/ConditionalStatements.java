package Fundamentals;
public class ConditionalStatements {
    public static void main(String[] args) {
        // Conditional Statements
        // if, else if, else
        // switch

        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }

        int x = 10;
        int y = 20;
        int z = 30;

        if (x > y && x > z) 
            System.out.println("x is the greatest");
        else if (y > x && y > z) 
            System.out.println("y is the greatest");
        else
            System.out.println("z is the greatest");

        if (x > y && x > z) {
            System.out.println("x is the greatest");
        } else if (y > x && y > z) {
            System.out.println("y is the greatest");
        } else {
            System.out.println("z is the greatest");
        }
    }
}

package Fundamentals;
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int result = a > b ? a : b;
        System.out.println(result);

        int x = 6;
        int y = 5;

        int result2 = x > y ? x : y;
        System.out.println(result2);

        double u = 8.8;
        double w = 9.8;

        double result3 = u >= w ? u : w;
        System.out.println(result3);

        int n = 4;
        int result4 = 0;

        if (n%2 == 0) {
            result4 = 10;
        } else {
            result4 = 20;
        }

        int result5 = n%2 == 0 ? 10 : 20;

        System.out.println(result4);
        System.out.println(result5);
    }
}

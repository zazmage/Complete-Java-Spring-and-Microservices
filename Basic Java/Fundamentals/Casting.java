package Fundamentals;
public class Casting {
    public static void main(String[] args) {
        byte b = 127;
        int a = 12;
        b = (byte)a;
        System.out.println(b);

        byte c = 14;
        int d = 230;
        d = c; // Conversión implicita.
        System.out.println(d);

        float f = 5.6f;
        int x = (int)f;
        System.out.println(x);

        byte g = 127;
        int e = 257;
        byte k = (byte)e;
        
        System.out.println(k);
    }
}

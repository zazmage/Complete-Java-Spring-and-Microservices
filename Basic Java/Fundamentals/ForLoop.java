package Fundamentals;
public class ForLoop {
    public static void main(String[] args) {
        
        for (int i = 0; i <= 4; i++) {
            System.out.println("Hi " + i);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Hi " + i);
        }

        for (int i = 4; i >= 1; i--) {
            System.out.println("Hi " + i);
        }

        for (int i = 0; i <= 5; i++) {
            System.out.println("DAY " + i);
            for (int j = 1; j <= 9; j++) {
                System.out.println("   " + (j + 8) + " - " + (j + 9));
            }
        }

        int i = 0;
        for (;i <= 4;) {
            System.out.println("Hi " + i);
            i++;
        }
    }
}

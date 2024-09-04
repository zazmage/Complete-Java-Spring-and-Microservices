package Fundamentals;
public class WhileDoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 4){
            System.out.println("Hi " + i);
            int j = 1;
            while(j<=3){
                System.out.println("Hello " + j);
                j++;
            }
            i++;
        }
        System.out.println("Bye " + i);

        // Do while
        int k = 5;

        do{
            System.out.println("Hi " + i);
        }while (k<=4);
    }
}

package Fundamentals;
public class AssignmentOperators {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;

        int result = num1 / num2; // 1 Solo se obtiene el cosiente no el residuo
        int result2 = num1 % num2; // Se obtiene el residuo
        float result3 = num1 / num2;
        double result4 = (float) num1 / num2; // 1.399999976158142 Casting 
        double result5 = num1 / num2;
        double result6 = (double) num1 / num2;

        System.out.println("Result 1: " + result); 
        System.out.println("Result 2: " + result2);  
        System.out.println("Result 3: " + result3);  
        System.out.println("Result 4: " + result4);
        System.out.println("Result 5: " + result5);
        System.out.println("Result 6: " + result6);

        num1 = num1 + 2;
        System.out.println("Num1 after adding 2: " + num1);
        num1 += 2;
        System.out.println("Num1 after adding 2 using +=: " + num1);
        num1 -= 2;
        System.out.println("Num1 after subtracting 2 using -=: " + num1);
        num1 *= 2;
        System.out.println("Num1 after multiplying by 2 using *=: " + num1);
        num1 /= 2;
        System.out.println("Num1 after dividing by 2 using /=: " + num1);
        num1 %= 2;
        System.out.println("Num1 after taking modulus with 2 using %=: " + num1);

        num1--; // Decrement
        num1++; // post Increment
        System.out.println("Num1 after post-increment: " + num1);
        ++num1; // pre Increment
        --num1; // Decrement
        System.out.println("Num1 after pre-increment and decrement: " + num1);


        int num3 = 7;
        int num4 = 7;
        int result7 = ++num3; // pre Increment - Fetch the value and then increment
        int result8 = num4++; // post Increment - Increment the value and then fetch
        System.out.println("Result 7: " + result7);
        System.out.println("Result 8: " + result8);
    }
}

package POO.BasicPoo;
class Calculator{
    int a;
    public int add(int n1, int n2){
        System.out.println("in add");
        return n1 + n2;
    }
}

class ClassesAndObjects{
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5; // Primitive variables

        Calculator calc = new Calculator(); // Reference variable

        int result = calc.add(num1, num2);

        System.out.println(result);

    }
}
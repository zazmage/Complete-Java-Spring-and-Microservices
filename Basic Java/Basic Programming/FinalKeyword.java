// final - variable, method, class
// variable: value cannot be changed
// method: cannot be overridden
// class: cannot be inherited

final class Calc{ // If you make a class final, you cannot inherit from it
    public void show(){
        System.out.println("In Calc show");
    }
    public void add (int a, int b){
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc{ // Cannot inherit from final 'Calc'
    public void sub(int a, int b){
        System.out.println(a-b);
    }
    public void add(int a, int b){
        System.out.println(a+b+ " from AdvCalc");
    }

}

class Calc2{
    public final void show(){ // If you make a method final, you cannot override it
        System.out.println("By Daniel");
    }
}

class AdvCalc2 extends Calc2{
    public void show(){ // Cannot override the final method from Calc2
        System.out.println("By Navin");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        int num = 8;
        num = 9;
        System.out.println(num);

        final int NUM2 = 8;
        // NUM2 = 9; // Cannot assign a value to final variable 'NUM2'
        System.out.println(NUM2);
        System.out.println(Math.PI);
        System.out.println(Math.E);

        Calc obj = new Calc();
        obj.show();
        obj.add(5, 6);


    }
}

class A{
    public void show(){
        System.out.println("In A show");
    }

    public void config(){
        System.out.println("In A Config");
    }
}

class B extends A{
    
    @Override
    public void show(){
        System.out.println("In B Show");
    }
}

class Calc  {
    public int add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}

class AdvCalc extends Calc {
    @Override
    public int add(int n1, int n2){
        return n1 + n2 + 1;
    }
}

class OverridingMethods{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();

        AdvCalc obj2 = new AdvCalc();
        int r1 = obj2.add(4, 5);
    }
}
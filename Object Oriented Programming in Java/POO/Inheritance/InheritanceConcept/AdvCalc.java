// In Java multiple inheritance is not supported, but multiple level inheritance is supported
// Multiple inheritance causes ambiguity, so it is not supported in Java
// Child, sub, derived class
public class AdvCalc extends Calc { // AdvCalc is a Calc, Single level inheritance
    public int multi(int n1, int n2){
        return n1 * n2;
    }
    public int div(int n1, int n2){
        return n1 / n2;
    }
}

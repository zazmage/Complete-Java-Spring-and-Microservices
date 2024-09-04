import java.util.ArrayList;
// import tools.AdvCalc;
// import tools.Calc;
import other.*; // This will import all the classes from the other package.
import other.tools.*; // This will import all the classes from the tools package.	    
import java.lang.*; // This is not necessary, because Java imports the java.lang package by default.

public class Main {
    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // Wichever you want to use belongs to a package.
        Calc obj = new Calc();
        AdvCalc obj1 = new AdvCalc();

        A obj2 = new A();  

        // We have never imported the class System, but we can use it.
        // By default, Java imports the java.lang package, which contains the System class.
        System.out.println(obj.add(2, 3)); 
    }
}

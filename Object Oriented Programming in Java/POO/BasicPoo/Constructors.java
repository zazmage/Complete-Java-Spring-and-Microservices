package POO.BasicPoo;
class Human{
    private int age; // This variable is only accessible within this class
    private String name; // Every time you create an instance variable make it private

    // If you don't create a constructor, Java will create a default constructor for you

    public Human(){ // Default constructor
    }

    // public Human(){ // Default constructor
    //     age = 12;
    //     name = "John";
    // }

    public Human(String name){ // Parameterized constructor with one parameter
        age = 12;
        this.name = name;
    }

    public Human(int age, String name){ // Parameterized constructor
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age; 
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

public class Constructors {
    public static void main(String[] args) {
        
        Human obj = new Human();
        Human obj1 = new Human(18, "Navin"); 

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}

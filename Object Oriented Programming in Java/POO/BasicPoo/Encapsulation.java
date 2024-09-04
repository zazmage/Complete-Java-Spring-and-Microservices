package POO.BasicPoo;
class Human{
    private int age; // This variable is only accessible within this class
    private String name; // Every time you create an instance variable make it private

    public int getAge(){
        return age;
    }

    public void setAge(int age
        // ,Human obj
        ){
        // the preference is allways for the local variable
        // age = age; // The variable age here is actually a local variable, it's trying to assign itself to itself
        // obj.age = age; // This is a way to assign the local variable to the instance variable but it's not the best way
        this.age = age; // This is the best way to assign the local variable to the instance variable
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        
        Human obj = new Human();
        obj.setAge(25, obj);
        obj.setName("John");

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}

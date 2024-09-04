public class InmutableString {
    public static void main(String[] args) {
        String name = "Navin"; // Is not a primitive type but a class, it doesnt have the new keyword
        String name2 = new String(); // This is the way to create a string object

        System.out.println(name);
        System.out.println(name2);

        System.out.println("Hello " + name); // Concatenation
        System.out.println(name.charAt(1)); // a
        System.out.println(name.concat(" reddy"));

        name = name + "ready"; // You are not changing the original string, you are creating a new string

        String s1 = "Navin";
        String s2 = "Navin";

        System.out.println(s1 == s2); // True, because both are pointing to the same memory location in the heap called String constant pool
        // Every string in java is actually a constant and immutable

        String s3 = "Daniel";
        System.out.println(s1 == s3); // False, because they are pointing to different memory locations

    }
}

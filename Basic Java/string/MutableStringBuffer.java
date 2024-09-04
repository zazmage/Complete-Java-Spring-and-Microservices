public class MutableStringBuffer {
    public static void main(String[] args) {
        // StringBuffer is thread safe, but slower than StringBuilder
        StringBuffer sb = new StringBuffer("Navin"); // StringBuffer is mutable
        StringBuilder sb2 = new StringBuilder("Navin"); // StringBuilder is not thread safe, but faster than StringBuffer
        System.out.println(sb.capacity()); // 16 - 21
        System.out.println(sb.length()); // 5
        System.out.println(sb.append(" Reddy")); // Navin Reddy

        sb.deleteCharAt(2); // Remove the character at the index 2
        System.out.println(sb); // Nain Reddy

        sb.insert(0, "Java "); // Insert the character v at the index 2
        sb.setLength(30);
        sb.ensureCapacity(100);

        String str = sb.toString(); // Convert the StringBuffer to a String

        sb2.append(" Reddy");
        System.out.println(sb2); // Navin Reddy
        sb2.delete(0, 5); // Remove the characters from index 0 to 5
        System.out.println(sb2); // Reddy
    }
}

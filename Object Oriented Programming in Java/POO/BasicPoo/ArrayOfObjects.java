package POO.BasicPoo;
class Student{
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Navin";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Rahul";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Sonu";
        s3.marks = 85;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student s : students) {
            System.out.println(s.rollno + " " + s.name + " " + s.marks);
        }
    }
}

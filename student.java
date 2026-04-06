public class student {
    String name;
    int rollno;
    static String collegeName = "Saveetha";

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Roll No:" + rollno);
        System.out.println("College Name:" + collegeName);
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Soorya";
        s1.rollno = 1;
        s1.display();
    }
}

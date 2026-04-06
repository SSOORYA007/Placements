import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
    }

    public String toString() {
        return "Name: " + name + " Marks: " + marks;
    }
}

public class comparablesortingobjects {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("ravi", 80));
        students.add(new Student("arun", 90));
        students.add(new Student("kiran", 70));

        Collections.sort(students);
        System.out.println(students);

    }
}

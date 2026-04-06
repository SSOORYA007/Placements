public class immutable {
    final class Student {
        private final int id;
        private final String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Soorya");
        System.out.println(s1.getId());
        System.out.println(s1.getName());
    }
}

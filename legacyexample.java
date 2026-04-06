interface sample {
    // void display();

    void add(int a, int b);

}

public class legacyexample {
    public static void main(String[] args) {
        // sample s = () -> System.out.println("Hello"); // {
        // public void display() {
        // System.out.println("Hello");
        // }
        // };
        sample s1 = (a, b) -> System.out.println(a + b);
        // s.display();
        s1.add(10, 20);
    }
}
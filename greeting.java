interface Greetable {
    void greet();
}

public class greeting {
    public static void main(String[] args) {
        Greetable g = () -> System.out.println("Hello");
        g.greet();
    }
}

import java.util.*;

public class parallelstream {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Sequential Stream");
        l.stream()
                .forEach(n -> System.out.println(Thread.currentThread().getName() + "-" + n));
        System.out.println("Parallel Stream");
        l.parallelStream()
                .forEach(n -> System.out.println(Thread.currentThread().getName() + "-" + n));
    }
}

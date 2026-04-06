import java.util.*;
import java.util.stream.*;

public class stream {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long evenNumbers = l.stream()
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("Even count: " + evenNumbers);

        l.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.println(n));
    }
}

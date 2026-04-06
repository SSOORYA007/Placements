public class returnx {

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        returnx calc = new returnx();

        int result = calc.add(10, 5);

        System.out.println("The sum is: " + result);
    }
}

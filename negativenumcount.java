public class negativenumcount {
    public static void main(String[] args) {
        int[] arr = {-5, -3, -1, 2, 4, 6, 8};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            } else {
                break;
            }
        }

        System.out.println("Negative numbers count: " + count);
    }
}

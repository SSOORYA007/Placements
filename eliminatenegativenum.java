public class eliminatenegativenum {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                continue;
            }
            if (arr[i] == 0) {
                break;
            }
            System.out.println(arr[i]);
        }

    }

}5

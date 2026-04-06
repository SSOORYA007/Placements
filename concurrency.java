public class concurrency extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        concurrency thread = new concurrency();
        thread.start();

        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println("Amount");
        amount++;
        System.out.println(amount);
    }

    public void run() {
        try {
            Thread.sleep(22000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        amount++;
    }
}

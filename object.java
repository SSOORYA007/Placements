public class object {
    int x = 5, y = 10;
    String fn = "Soorya";
    String ln = "Saravanan";

    public static void main(String[] args) {
        object myObj1 = new object();
        object myObj2 = new object();
        myObj1.x = 10;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
        System.out.println("Name:" + myObj1.fn + " " + myObj1.ln);
        System.out.println("Sum:" + (myObj1.x + myObj1.y));
        System.out.println("product:" + (myObj1.x * myObj1.y));
    }

    public int sum() {
        int h = x + y;
        return h;
    }

    public String name() {
        String j = fn + " " + ln;
        return j;
    }
}

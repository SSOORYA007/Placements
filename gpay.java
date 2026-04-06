interface payment {
    void pay();
}

class gpay implements payment {
    public void pay() {
        System.out.println("GpayPayment");
    }

    class phonepe implements payment {
        public void pay() {
            System.out.println("PhonepePayment");
        }
    }

public class main {
    public static void main(String[] args) {
       payment  p;
       
       p=new gpay();
       p.pay();

       p=new phonepe();
       p.pay(); 
    }
}

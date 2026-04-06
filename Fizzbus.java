public class Fizzbus{
    public static void main(String[] args) {
        for(int i=0;i<101;i++)
        {
            if(i%3==0 && i%5==0)
                { System.out.println("Fizzbus");}
            else if(i%3)
                {System.out.println("bus");}
            else
                {System.out.println("Fizz");}
            }

        }
}

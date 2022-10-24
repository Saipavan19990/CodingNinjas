import java.util.Scanner;

public class LoopsUsingReturn
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int div =2;             //min factors
        boolean isPrime=true;
        while(div<=n/2) {
            if (n%div == 0) {
                System.out.println("number is composite");

                return;             // Stop after an execution
            }
            div++;
        }
        System.out.println("number is prime");
    }
}

import java.util.Scanner;

public class SquareNumber_pattern
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();

        int i=1;
        while(i<=N)				//Rows
        {
            int j=1;
            while(j<=N)
            {
                System.out.print(N + " ");
                j++;
            }

            System.out.println();
            i++;

        }


    }

}

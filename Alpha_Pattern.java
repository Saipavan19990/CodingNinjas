import java.util.Scanner;

public class Alpha_Pattern
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int k=65;
        while(i<=n)                 //I <= 4 rows
        {
            int j=1;

            while (j<=n)
            {

                System.out.print((char)k);
                j++;                    //j=2
            }
            // System.out.println();
            k++;
            i++;                    //i=2
            System.out.println();

        }

    }

}
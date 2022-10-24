import java.util.Scanner;

public class NumberPattern3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;

        while(i<=N)
        {
            int j=1;
            while(j<=i)
            {
                for(int p=i;p<=i;p--)
                {
                    System.out.print(p);
                    p++;
                }
                j++;
                System.out.println();
            }

            i++;
        }


    }

}

import java.util.Scanner;

public class Left_pyramid1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i=1 ;
        int p=1;                        //for contd. number series
        int N=sc.nextInt();
        while(i<=N)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print(p+" ");
                p=p+1;
                j++;
            }
            System.out.println();
            i++;
        }

    }
}

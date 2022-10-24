import java.util.Scanner;

public class Character_Pattern1
{
    public static void main(String[] args )
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n)                 //I <= 4 rows
        {
            int j=1;
            while (j<=i)            //2. j<=2 so A & B
            {
                char jthchar=(char)('A'+j-1);// A+1-1 =A ; A+2-1=B ;
                System.out.print(jthchar);
                j++;                    //j=2
            }
            System.out.println();
            i++;                    //i=2

        }

    }
}

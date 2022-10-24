import java.util.Scanner;

public class Character_Pattern3
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
            char p=(char)('A'+i-1); //Starting letter of  row
            while (j<=n)
            {

                System.out.print(p);        //Remaining letters of row
                p=(char)(p+1);
                j++;                //j=2
            }
            // System.out.println();
            System.out.println();
            i++;                    //i=2
        }
    }
}

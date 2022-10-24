import java.util.Scanner;

public class NumberPattern1
{
    public static void main(String[] args)
    {
      int i,j,number,n=5;

      for(i=0;i<=n;i++)                     //ROWS & (i++ after println())
      {
          number = 1;
          number = number*2;
          for(j=0;j<=i;j++)                     //inside rows  = cols
          {
              System.out.print(number + "  ");
                  number= number*2;
          }
          System.out.println();
      }
    }
}

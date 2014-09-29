import java.util.Scanner;

public class Annuity
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       double pmt, i, n;
       
       System.out.print("Enter the payment: ");
       pmt = s.nextDouble();
       
       System.out.print("Enter the interest: ");
       i = s.nextDouble();
       
       System.out.print("Enter the number of payments: ");
       n = s.nextDouble();
       
       double pv = 0;
       
       pv = pmt * (((Math.pow((1 + i),(n - 1)) - 1) / i) / Math.pow((1 + i), (n - 1)) + 1);
       pv = Math.round(pv);
       System.out.println("Your Annuity is: " + pv);
   }
}

//PVann = PMT · ({[(1 + i)n - 1 - 1] / i } / (1 + i)n - 1 + 1)


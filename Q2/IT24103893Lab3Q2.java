import java.util.Scanner;
public class IT24103893Lab3Q2 {
      public static void main (String [] args)
     {
            Scanner Salary = new  Scanner (System.in);
            double OThours, OThourlyrate, OTamount, Totalsalary, Monthlysalary ;

            System.out.print("Enter the monthly slary:");
            Monthlysalary = Salary.nextInt();
            System.out.print("Enter the number of OT hours:");
            OThours = Salary.nextInt();
            System.out.print("Enter the OT hourly rate:");
            OThourlyrate = Salary.nextInt();
 
            OTamount = OThours * OThourlyrate ;
            Totalsalary = Monthlysalary + OTamount ;
     
      System.out.print("The total salary including OT is" + Totalsalary) ;
      } 
}
 
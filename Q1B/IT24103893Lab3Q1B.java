import java.util.Scanner; 
public class IT24103893Lab3Q1B {
  public static void main (String [] args)
   {
         Scanner rice = new Scanner (System.in);
         double priceof1kg, numberofkilograms, totalvalue, discount, totalamount;
 
         System.out.print("Enter the price of 1KG of rice");
         priceof1kg = rice.nextInt();
         System.out.print("Enter the number of kilograms you want to buy");
         numberofkilograms = rice.nextInt();

         totalvalue = priceof1kg * numberofkilograms ;
    
         totalamount = totalvalue * 0.9 ;
    System.out.print("total amount with 10% discount is:" + totalamount);
      
        }
 }
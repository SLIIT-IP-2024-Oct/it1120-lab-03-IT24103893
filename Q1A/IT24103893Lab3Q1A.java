import java.util.Scanner; 
public class IT24103893Lab3Q1A {
  public static void main (String [] args)
   {
         Scanner rice = new Scanner (System.in);
         int priceof1kg, numberofkilograms, totalvalue;
 
         System.out.print("Enter the price of 1KG of rice");
         priceof1kg = rice.nextInt();
         System.out.print("Enter the number of kilograms you want to buy");
         numberofkilograms = rice.nextInt();

         totalvalue = priceof1kg * numberofkilograms ;
    System.out.print("Totla value of the rice = "+ totalvalue);
 }
}
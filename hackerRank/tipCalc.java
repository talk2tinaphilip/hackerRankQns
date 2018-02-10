/**
 * 
 */
package hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @author Tina
 *
 */
public class tipCalc {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
       // tipPercent = tipPercent/100;
       // taxPercent = taxPercent/100;
        double tip = (mealCost*tipPercent)/100; 
        double tax = (mealCost*taxPercent)/100; 
        

        System.out.println("tip = " + tip); System.out.println(tax); 
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(tip+tax+mealCost);
      
        // Print your result
        System.out.println(totalCost);
    }

}

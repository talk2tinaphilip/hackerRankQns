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
public class recursive_factorial {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n <= 1)
            System.out.println(1);
        else
            System.out.println(factorial(n));
    }

	public static int factorial(int n1) {
    	int fact = 1;
        if(n1 != 0)
        	fact = n1*factorial(n1-1);
        return fact;
    }
}
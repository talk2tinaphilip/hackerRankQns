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
public class bigInt {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0)
        	System.out.println("Factorial = 1" );
        else {
	        BigInteger factorial = fact(n);
	        System.out.println("Factorial = " + factorial);
        }
    }
	
    public static BigInteger fact(int n){
    	BigInteger factorial = new BigInteger("1");
    	for(int i=1; i<=n; i++){
    		factorial = factorial.multiply(BigInteger.valueOf(i));
    	}      
	    return  factorial;
    }
}

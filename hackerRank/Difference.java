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
public class Difference {
	private int[] elements;
	public int maximumDifference;
	// Add your code here
	Difference(int[] a){
		for(int j = 0; j < a.length; j++)
			this.elements[j] = a[j];
	}
	computeDifference(){
	    for(int i = 0; i < a.length; i++ ){
	        for(int j = 0; j < a.length; j++ ){
	            a[i] ;
	        }
	    }
	}
	
	maximumDifference(){
	    
	}
} // End of Difference class

public class Solution {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    for (int i = 0; i < n; i++) {
	        a[i] = sc.nextInt();
	    }
	    sc.close();
	
	    Difference difference = new Difference(a);
	
	    difference.computeDifference();
	
	    System.out.print(difference.maximumDifference);
	}
}

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
public class birthday {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in = new Scanner(System.in);
        //n = total candles
         int n = in.nextInt();
        //ar is an array of size n to store height of candles
         int[] ar = new int[n];
         int largest = 0;
         int count = 0;
        for(int i = 0; i < n; i++){
            ar[i] = in.nextInt();
             if(ar[i] > largest)
               largest = ar[i];
        }
        for(int i = 0; i < n; i++){
            if(ar[i] == largest){
              count++;
            }
        }
        System.out.println(count);
    }

}

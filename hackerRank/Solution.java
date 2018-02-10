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

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        int d = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int i=0; i < d; i++){
        	for(int j=0; j<arr.length-1; j++){
        		int temp = arr[j];
        		arr[j] = arr[j+1];
        		arr[j+1] = temp;
        	}
        }
        for(int k=0; k < arr.length; k++){
            System.out .print(arr[k] + " ");
        }
        
    }
}
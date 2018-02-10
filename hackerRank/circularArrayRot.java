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
public class circularArrayRot {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int N=in.nextInt();
	    int K=in.nextInt();
	    int Q=in.nextInt();
	    int shift=K%N;
	    int[] arr=new int[N];
	    for(int i=0;i<N;i++)
	        arr[i]=in.nextInt();
	    for(int i=0;i<Q;i++){
	           int query=in.nextInt();
	           if(query-shift>=0)
	              System.out.println(arr[query-shift]);
	           else
	            System.out.println(arr[query-shift+arr.length]);
	   }
	}
}

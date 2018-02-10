package hackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.EmptyStackException;

/**
 * @author Tina
 *
 */
public class Stack_Demo {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        Stack st = new Stack(); 
        Stack track = new Stack(); 
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            if((arr[i]) == 1){
                //Push the element x into the stack.
                int elt = arr[i]+1;
                if(st.isEmpty){
	                st.push(elt);
	                track.push(elt);
                }else{
                	int a = track.peek();
        			track.push(Math.max(a, elt));
        			st.push(elt);// insert it into main stack.
                }
            }
            else if((arr[i]) == 2){
                //Delete the element present at the top of the stack.
            	if(!empty(st)){
            		st.pop();
            		track.pop();
            	}
            }
            else if((arr[i]) == 3){
                //Print the maximum element in the stack.
            	int maximum = track.peek();
            	System.out.print(maximum);
            }
        }
    }
}

/**
 * 
 */
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
public class Stack {
	
	public static void main(String args[]) {
        	   // creating stack
        	   Stack st = new Stack();
        	      
        	   // populating stack
        	   st.push("Java");
        	   st.push("Source");
        	   st.push("code");
        	      
        	   // checking the top object
        	   System.out.println("Top object is: "+st.peek());
    }

}

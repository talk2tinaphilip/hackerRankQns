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
public class oddEven {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String even = "";
        String odd = "";
        String[] ar = new String[t];
        for(int i = 0; i < t; i++){
            ar[i] = in.next();
        }
         for(int j = 0; j < t; j++){
            for(int k = 0; k < ar[j].length(); k++){
            	char c = ar[j].charAt(k);
                if(k%2 == 0){ 
                		even = even.concat(Character.toString(c));
                }else {
                		odd= odd.concat(Character.toString(c));
                	
                }
                
            }
            System.out.println(even +" "+ odd);
            even = "";
            odd = "";
        }
    }
}

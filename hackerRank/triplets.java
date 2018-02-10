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
public class triplets {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int Alice = 0;
        int Bob = 0;
        if(a0!=b0){
	        if(a0<b0){
	            //Bob gets a point
	            Bob++;
	        }else{
	            Alice++;
	        }
        }
        
        if(a1!=b1){
	        if(a1<b1){
	            //Bob gets a point
	            Bob++;
	        }else{
	            Alice++;
	        }
        }
        
        if(a2!=b2){
	        if(a2<b2){
	            //Bob gets a point
	            Bob++;
	        }else{
	            Alice++;
	        }
        }
        System.out.print(Alice + " " + Bob);
    }

}

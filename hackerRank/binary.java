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
public class binary {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int nums=0;
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        for(int i = 0; i < binary.length(); i++){
        	if((binary.charAt(i)==('1'))){
        		count++;
        		if(count>nums)
        			nums=count;
        	}
        	else
        		count=0;
        }
       System.out.println(Math.max(count,nums));
	}
}

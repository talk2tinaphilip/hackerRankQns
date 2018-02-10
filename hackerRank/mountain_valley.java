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
public class mountain_valley {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int move = 0;
        int v = 0;
        int movingup = 0;
        int valley = 0;
        String UD = in.next();
        for(int j = 0; j < n; j++){
            if(UD.charAt(j) == 'U'){
                //move up
                move++;
                movingup = 1;
            }else if(UD.charAt(j) == 'D'){
                //move down
                move--;
                movingup = 0;
            }
            if(move<0){
              //set to below sea level ->ie valley  
              v = 1; 
            }else{
               v = 0; 
            }
            if(move == 0 && movingup == 1 && v == 1 )
                valley++;   
       }
       System.out.println(valley); 
    } 
}

/**
 * 
 */
package hackerRank;

import java.util.Scanner;

/**
 * @author Tina
 *
 */
public class valley {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int up = 0;
        int down = 0;
        int valley = 0;
        int moving_down = 0;
        String input = in.next();
        for(int j = 0; j < n; j++){
            if(input.charAt(j) == 'U'){            	
            	up++;
            }else if(input.charAt(j) == 'D'){            	
            	down++;
            	moving_down = 1;
            }
            if(up == down){
            	valley++;
            }
        }
        System.out.println(valley);
	}
}

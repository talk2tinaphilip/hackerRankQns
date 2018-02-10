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
public class hourgalss {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        //enter values into array
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(findAllHourglass(arr));
    }
	public static int findAllHourglass(int arr[][]){
		int sum;
		int max = -64;
		for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
            	sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + 
            		  arr[i+1][j+1] + 
            		  arr[i+2][j] +  arr[i+2][j+1]+  arr[i+2][j+2]; 
            	if(max < sum)
            		max = sum;
            }
        }	
		return max;
	}
}

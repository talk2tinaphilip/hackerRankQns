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
public class LCS {
	public static void main(){
		Scanner in = new Scanner(System.in);
		String X = in.next();
		String Y = in.next();
		int m = in.nextInt();
		int n = in.nextInt();
		lcsLength(X, Y, m, n);
	}
	private static int lcsLength(String X, String Y, int m, int n)
	{
	 if ((m == 0) || (n == 0)) {
	 return 0;
	 }
	 else if (X.charAt(m-1) == Y.charAt(n-1)) {
	 return 1 + lcsLength(X, Y, m-1, n-1);
	 }
	 else {
	 return Math.max(lcsLength(X, Y, m, n-1),
	 lcsLength(X, Y, m-1, n));
	 }
	}

}

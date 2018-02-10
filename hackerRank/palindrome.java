/**
 * 
 */
package hackerRank;

import java.util.Scanner;

/**
 * @author Tina
 *
 */
public class palindrome {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String charactersSet = scan.next();
		palindromeGen(charactersSet);
	}
	public static String palindromeGen(String charactersSet) {
		charactersSet = charactersSet.toLowerCase();
		return charactersSet;
	}
}


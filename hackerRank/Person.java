/**
 * 
 */
package hackerRank;

import java.util.Scanner;
import java.io.*;
import java.util.*;

/**
 * @author Tina
 *
 */
public class Person {
	private int age;	
	  
	public Person(int initialAge) {
		
		
  		// Add some more code to run some checks on initialAge           
        if(initialAge>0){ 
        	System.out.println("in  age>0: "+ age);
            age = initialAge;
        }else{
        	System.out.println("in  age<0: "+ age);
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

	public void amIOld() {
		System.out.println("in  amIOld: "+ age);
		// Write code determining if this person's age is old and print the correct statement:
        if(age<13){
            System.out.println("You are young.");
        }
        else if(age>= 13 && age< 18){
            System.out.println("You are a teenager.");
        }
        else{
            System.out.println("You are old.");
        };
	}

	public void yearPasses() {
		System.out.println("in  yearPasses: "+ age);
  		// Increment this person's age.
        age++;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			System.out.println("current age = " +age);
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}

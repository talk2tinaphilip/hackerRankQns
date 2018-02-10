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
public class array_demo {
	public static void main(String[] args) {
		Map<String,Integer> hm = new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i < n; i++){
            String name = in.next();
            int phone 	= in.nextInt();
            hm.put(name, phone);
        }
        while(in.hasNext()){
        	String query = in.next();
        	if(hm.containsKey(query)){
        		System.out.println(query+"="+hm.get(query));
        	}else{
        		System.out.println("Not found");
        	}
        }
        in.close();
    }
}
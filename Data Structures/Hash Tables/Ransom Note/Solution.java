package htRansomNote;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static String isValidRansom(String[] m, String[] n) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		
		//Populate HashTable with 
		for(int i = 0; i < m.length; i++) {
			if(ht.containsKey(m[i])) ht.put(m[i], ht.get(m[i]) + 1);
			else ht.put(m[i], 1);
		}
		
		//Go through ransom updating hashtable
		for(int i = 0; i < n.length; i++) {
			if(!ht.containsKey(n[i])) return "No";
			else if(ht.get(n[i]) < 1) return "No";
			else ht.put(n[i], ht.get(n[i]) - 1);
		}
		
		return "Yes";
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        
        System.out.println(isValidRansom(magazine, ransom));
    }
}
package MinAnagram;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
		public static int numberNeeded(String a, String b) {
			
			HashSet<Integer> hs = new HashSet<Integer>(); //keep track of index of matched values in shorter string
				
				for(int i = 0; i < a.length(); i++) {
					for(int j = 0; j < b.length(); j++) {
						if(hs.contains(j)) continue;
						if(a.charAt(i) == b.charAt(j)) { 
							hs.add(j);
							break;
						}
					}
				}
				
			return (a.length() + b.length()) - 2*hs.size();
		}
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String a = in.next();
	        String b = in.next();
	        System.out.println(numberNeeded(a, b));
	    }
}

package Contacts;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		TreeBuilder tb = new TreeBuilder();
		
		for(int a0 = 0; a0 < n; a0++){
			String op = in.next();
			String contact = in.next();
			
			if(op.equals("add")){
				tb.addWord(contact);
			} else {
				tb.printPartialCount(contact);
			}
			
		}
		
		in.close();
	}
}

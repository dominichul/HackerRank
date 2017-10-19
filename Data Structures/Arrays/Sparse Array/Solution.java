package SparseArray;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner in  = new Scanner(System.in);
    	
    	int n = in.nextInt();
    	
    	HashMap<String, Integer> hm = new HashMap<String, Integer>();
    	
    	for(int i = 0; i < n; i++){
    		String s = in.next();
    		if(hm.get(s) != null){
    			hm.put(s, hm.get(s) + 1);
    		} else{
    			hm.put(s, 1);
    		}
    	}
    	
    	int q = in.nextInt();
    	int[] countArr = new int[q];
    	
    	for(int i = 0; i < q; i++){
    		String s = in.next();
    		if(hm.containsKey(s)) countArr[i] = hm.get(s);
    		else countArr[i] = 0;
    	}
    	
    	for(int i = 0; i < q; i++) System.out.println(countArr[i]);
    	
    	in.close();
    }
}
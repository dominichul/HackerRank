package RecursionDavisStaircase;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * Problem: Given 's' number of staircases, each with different number of steps. For each staircase, print the number of possible ways to
 * climb the staircase. Davis can climb steps in increments of 1,2,and 3 steps.
 */
public class Solution {
	
	public static HashMap<Integer, Integer> cache; //use HashMap to store number of paths for n stairs

    public static void main(String[] args) {
    	cache = new HashMap<Integer, Integer>();
        Scanner in = new Scanner(System.in);
        int s = in.nextInt(); // # staircases
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt(); // # of steps for staircase
            System.out.println(getNumberOfPaths(n));
        }
    }
    
    public static int getNumberOfPaths(int n){
    	if(n == 1) return 1;
    	else if(n == 2) return 2;
    	else if(n == 3) return 4;
    	else{
    		if(!cache.containsKey(n)){ //if we've already calculated # possibilities for n, don't recalculate.
    			int paths = getNumberOfPaths(n-3) + getNumberOfPaths(n-2) + getNumberOfPaths(n-1);
    			cache.put(n, paths); // store for n stairs
    		}
    		return cache.get(n);
    	}
    }
}

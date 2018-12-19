package BinarySearchIceScreamParlour;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); //# trips
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt(); //money for trip
            int n = in.nextInt(); //number of flavors
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt(); //cost of each flavor
            }
            getFlavors(a, m);
        }
    }
    
    public static void getFlavors(int[] arr, int money){
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	
    	for(int i = 0; i < arr.length; i++){
    		if(hm.get(arr[i]) != null) { 
    			System.out.println(hm.get(arr[i]) + " " + (i + 1));
    			return;
    			}
    		else {
    			hm.put(money - arr[i], i + 1);
    		}
    	}
    	
    }
}

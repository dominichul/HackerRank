package BubbleSort;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        swap(a);
        
    }
    
    public static void swap(int[] arr){
    	int minPasses = arr.length-1;
    	int numSwaps = 0;
    	boolean isSorted = false;
    	while(!isSorted){
    		isSorted = true;
    		for(int i = 0; i < minPasses; i++){
    			if(arr[i] > arr[i+1]){
    				isSorted = false;
    				int tmp = arr[i];
    				arr[i] = arr[i+1];
    				arr[i+1] = tmp;
    				numSwaps++;
    			}
    		}
    	}
    	
    	System.out.printf("Array is sorted in %d swaps%n", numSwaps);
    	System.out.printf("First Element: %d%n", arr[0]);
    	System.out.printf("Last Element: %d%n", arr[arr.length-1]);
    }
}

/*
 * Output format
 * Array is sorted in 0 swaps.
 *	First Element: 1
 *	Last Element: 3
 */
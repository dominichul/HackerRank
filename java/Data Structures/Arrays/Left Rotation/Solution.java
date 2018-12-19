package ArrayLeftRotation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


	/**
	 * This method is used to rotate values within an array by some number
	 * left. 
	 * Example: a = [5,7,2,7,9], d = 3 -> leftRotation(a,d) returns [7,9,5,7,2]
	 * @param 	a 	Array to be used for the rotation
	 * @param 	d 	Defines how many units the array will be rotated left. Can be larger than a.length
	 * @return  	A new array rotated left by 'd' units
	 */
    static int[] leftRotation(int[] a, int d) {
        int[] res = new int[a.length];
        
        // Prevents access to non-existing values in array 'a'. (if a.length = 5, result of d = 1 is equal to result of d = 6) 
        d = d % a.length;
        
        if(d == a.length) return a;
        
        for(int i = 0; i < a.length; i++) {
        	if((d+i) < a.length) res[i] = a[d+i];	// if the 'virtual' index of the value to be placed in res[i] is less than a.length
        	else res[i] = a[(d+i) - a.length];		//else, account for the overflow and subtract the array length 
        }
        
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}

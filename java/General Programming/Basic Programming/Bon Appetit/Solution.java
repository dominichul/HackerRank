package BonAppétit;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void bonAppetit(int n, int k, int b, double[] ar) {
    	double actual = findActual(n,k,ar); 
        if(b == actual) {
        	System.out.println("Bon Appetit");
        } else {
        	System.out.println((int)(b- actual));
        }
    }
    
    static double findActual(int n, int k, double[] ar) {
    	double actual = 0;
    	for(int i = 0; i < ar.length; i++) {
    		if(i != k) actual += ar[i]/2;
    	}
    	return actual;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        double[] ar = new double[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        bonAppetit(n, k, b, ar);
    }
}

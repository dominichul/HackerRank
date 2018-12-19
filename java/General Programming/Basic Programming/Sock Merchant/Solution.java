package SockMerchant;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
     Set<Integer> set = new HashSet<Integer>();
     int pairCount = 0;
     for(int i = 0; i < ar.length; i++){
    	 if(set.remove(ar[i])) pairCount++;
    	 else set.add(ar[i]);
     }
     return pairCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}

package PickingNumbers;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int cnt = 0;
        int max = 0;
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++){
        	for(int j = i; j < a.length; j++){
        		if(Math.abs(a[i] - a[j]) <= 1){
        			cnt++;
        		}
        	}
        	if(cnt > max) max = cnt;
        	cnt = 0;
        }
        
        System.out.println(max);
        
    }
}
package EqualStacks;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h1Sum = 0, h2Sum = 0, h3Sum = 0;
        int h1Ptr = 0, h2Ptr = 0, h3Ptr = 0;
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            h1Sum += h1[h1_i];
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            h2Sum += h2[h2_i];
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            h3Sum += h3[h3_i];
        }
        
        while(true){
        	if(h1Sum == 0 || h2Sum == 0 || h3Sum == 0){ System.out.println(0); break; }
        	
        	if(h1Sum > h2Sum && h1Sum > h3Sum){ //if h1 has largest sum
        		h1Sum -= h1[h1Ptr];
        		h1Ptr++;
        	} else if(h2Sum > h1Sum && h2Sum > h1Sum){ //if h2 has largest sum
        		h2Sum -= h2[h2Ptr];
        		h2Ptr++;
        	} else if(h3Sum > h1Sum && h3Sum > h2Sum){ //if h3 has largest sum
        		h3Sum -= h3[h3Ptr];
        		h3Ptr++;
        	} else if(h1Sum > h2Sum || h1Sum > h3Sum){ // if h1 is largest sum and either h1 or h2 share the same value
        		h1Sum -= h1[h1Ptr];
        		h1Ptr++;
        	} else if(h2Sum > h1Sum || h3Sum > h1Sum){
        		h2Sum -= h2[h2Ptr];
        		h2Ptr++;
        	}
        	else{
        		System.out.println(h1Sum);
        		break;
        	}
        }
    }
}
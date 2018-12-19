package Array2DDS;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int[][] arr = new int[6][6];
    	
    	for(int i = 0; i < 6; i++) {
    		for(int j = 0; j < 6; j++) {
    			arr[i][j] = in.nextInt();
    		}
    		in.nextLine();
    	}
    	
    	int largestSum = Integer.MIN_VALUE;
    	int localSum;
    	for(int i=0; i<16; i++) {
    			int divisor = i/4;
    			localSum = arr[divisor][i%4] + arr[divisor][i%4+1] + arr[divisor][i%4+2] + 
    					arr[divisor+1][i%4+1] + arr[divisor+2][i%4] + arr[divisor+2][i%4+1]+ arr[divisor+2][i%4+2];
    			if(localSum > largestSum) largestSum = localSum;
    	}
    	System.out.println(largestSum);
    	return;
    }
}
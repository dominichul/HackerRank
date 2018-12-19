package TimeComplexityPrimality;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            if(testPrimality(n)) System.out.println("Prime");
            else System.out.println("Not prime");
        }
    }
    
    public static boolean testPrimality(int n){
    	if(n < 2) return false;
    	if(n == 2) return true;
    	if(n%2 == 0) return false;
    	
    	int sqt = (int)Math.sqrt(n);
    	for(int i = 3; i <= sqt; i++){
    		if(n%i == 0) return false;
    	}
    	return true;
    	
    }
}
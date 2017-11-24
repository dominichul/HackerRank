package RecursionFibonacciNumbers;

import java.util.*;

public class Solution {

	
    /**
     * returns fibonnaci sequence f(n), where
     * f(n) = f(n-1) + f(n-2), f(1) = 1, f(0) = 0
     **/
    public static int fibonacci(int n) { //faster than using recursive f(n) = f(n-1) + f(n-2) 
    	if(n < 2) return n;
    	else{
    		int s0 = 0, s1 = 1, temp;
    		while(n > 2){	// declaring s0 = 0 and s1 = 1 already covers first 2 iterations
    			temp = s1;
    			s1 = s1 + s0;
    			s0 = temp;
    			n--;
    		}
    		return s0 + s1;
    	}
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
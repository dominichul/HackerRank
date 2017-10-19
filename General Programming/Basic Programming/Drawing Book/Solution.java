package DrawingBook;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        //Number of pages from 1
    	int fromOne = p/2;
    	//Number of pages from n
    	int fromN;
    	if(n%2 == 0) fromN = (n+1-p)/2;
    	else fromN = (n-p)/2;
    	int result = (fromOne < fromN) ? fromOne : fromN;
    	return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}

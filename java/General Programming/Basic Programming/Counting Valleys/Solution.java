package CountingValleys;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	String string = in.next();
    	char[] c = string.toCharArray();
    	in.close();
    	int level = 0;
    	int valleyCount = 0;
    	for(int i = 0; i < n; i++) {
    		if(c[i] == 'U') {
    			level++;
    			if(level == 0) valleyCount++;
    		} else if(c[i] == 'D'){
    			level--;
    			
    		}
    	}
    	System.out.println(valleyCount);
    	
    }
}
package ElectronicsShop;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int[][] queries = new int[q][3];
        for(int a0 = 0; a0 < q; a0++){
            queries[a0][0] = in.nextInt();
            queries[a0][1] = in.nextInt();
            queries[a0][2] = in.nextInt();
        }
        
        for(int i = 0; i < queries.length; i++) {
        	if(Math.abs(queries[i][0]-queries[i][2]) < Math.abs(queries[i][1]-queries[i][2])) System.out.println("Cat A");
        	else if(Math.abs(queries[i][0]-queries[i][2]) > Math.abs(queries[i][1]-queries[i][2])) System.out.println("Cat B");
        	else System.out.println("Mouse C");
        }
        
        
        
    }
}

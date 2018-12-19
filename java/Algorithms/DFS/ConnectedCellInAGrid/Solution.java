package DFSConnectedCellInAGrid;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int getBiggestRegion(int[][] matrix) {
    	
    	int maxSize = 0;
    	boolean visited[][] = new boolean[matrix.length][matrix[0].length]; 
    	
    	for(int i = 0; i < matrix.length; i++){
    		for(int j = 0; j < matrix[i].length; j++){
    			if(matrix[i][j] == 0 || visited[i][j] == true) continue;
    			else{ //found unvisited starting node. i and j can't be less than current values
    				int size = getSize(i,j, matrix, visited);
    				if(size > maxSize) maxSize = size;
    			}
    		}
    	}
        return maxSize;
    }
    
    public static int getSize(int i, int j, int[][] matrix, boolean[][] visited){
    	
    	int count = 0;
    	
    	if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length){ return count; }
    	else{
    		if(matrix[i][j] == 1 && visited[i][j] == false) {
    			visited[i][j] = true;
    			count++;
    			count += getSize(i-1, j-1, matrix, visited);
    			count += getSize(i-1, j, matrix, visited);
    			count += getSize(i-1, j+1, matrix, visited);
    			count += getSize(i, j-1, matrix, visited);
    			count += getSize(i, j+1, matrix, visited);
    			count += getSize(i+1, j-1, matrix, visited);
    			count += getSize(i+1, j, matrix, visited);
    			count += getSize(i+1, j+1, matrix, visited);
    			return count;
    		} else{ return count; }
    	}
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
}
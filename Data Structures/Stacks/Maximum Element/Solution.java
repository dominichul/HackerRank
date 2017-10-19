package Stacks.MaximumElement;

import java.io.*;
import java.util.*;

public class Solution {

	public static int max = Integer.MIN_VALUE;
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        Stack<CustomNode> maxStack = new Stack<CustomNode>();
        
        int qType;
        for(int i = 0; i < n; i++) {
        	qType = in.nextInt();
        	maxStack = processQuery(maxStack, qType, in);
        }
        in.close();
        
    }
    
    public static Stack<CustomNode> processQuery(Stack<CustomNode> stack, int queryType, Scanner in) {
    	
    	switch(queryType) {
    	case 1:
    		int newElement = in.nextInt();
    		if(max < newElement) {
    			stack.push(new CustomNode(newElement, newElement));
    			max = newElement;
    		} else stack.push(new CustomNode(newElement, max));
    		return stack;
    	case 2:
    		stack.pop();
    		if (!stack.isEmpty()) max = stack.peek().max;
    		else max = Integer.MIN_VALUE;
    		return stack;
    	case 3:
    		System.out.println(max);
    		return stack;
    	default:
    		return stack;
    	}
    }
    
    static class CustomNode {
    	int val;
    	int max;
    	public CustomNode( int v, int m ) { val = v; max = m; }
    }
    
}
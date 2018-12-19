package BalancedBrackets;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	
    public static boolean isBalanced(String expression) {
    	
    	if(expression.length() % 2 != 0 || !expression.matches("^[\\[\\]\\(\\)\\{\\}]+$")) return false;
    	
    	HashMap<Character, Character> ht = new HashMap<Character,Character>();
    	ht.put('(',')');
    	ht.put('[',']');
    	ht.put('{', '}');
    	
    	Stack<Character> stack = new Stack<Character>();
    	
    	for(int i = 0; i < expression.length(); i++){
    		char c = expression.charAt(i);
    		if( ht.containsKey(c) ) stack.push(c);
    		else if( !stack.isEmpty() && c == (char) ht.get(stack.pop())) continue;
    		else return false;
    	}
    	
    	if(stack.isEmpty())
    		return true;
    	else
    		return false;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }

}

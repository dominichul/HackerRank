package QueueUsingTwoStacks;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		
		CustomQueue<Integer> cq = new CustomQueue<Integer>();
		
		for(int i = 0; i < q; i++){
			int qType = in.nextInt();
			switch(qType){
			case 1:
				int element = in.nextInt();
				cq.enqueue(element);
				break;
			case 2:
				cq.dequeue();
				break;
			case 3:
				cq.peek();
				break;
			default: break;
			}
		}
		
	}
	
	public static class CustomQueue<T>{
		
		private Stack<T> oldStack;
		private Stack<T> newStack;
		
		
		public CustomQueue(){
			oldStack = new Stack<T>();
			newStack = new Stack<T>();
		}
		
		public void enqueue(T element){
			newStack.add(element);
		}
		
		public T dequeue(){
			if(!oldStack.isEmpty()){ return oldStack.pop(); }
			else{
				populateOldStack();
				return oldStack.pop();
			}
		}
		
		public void peek(){
			if(!oldStack.isEmpty()){ System.out.println(oldStack.peek()); }
			else {
				populateOldStack();
				System.out.println(oldStack.peek());
			}
		}
		
		public void populateOldStack(){
			int stackSize = newStack.size();
			for(int i = 0; i < stackSize; i++) oldStack.add(newStack.pop());
		}
		
	}
	
}

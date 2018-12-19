package ATaleOfTwoStacks;

import java.util.Stack;

public class MyQueue<T> {

	private Stack<T> o; //enqueue
	private Stack<T> n; //dequeue
	
	public MyQueue(){
		o = new Stack<T>();
		n = new Stack<T>();
	}
	
	//add new value to end of queue
	public void enqueue(T value){
		n.push(value);
	}
	
	
	//remove oldest value
	public T dequeue(){
		if(o.empty()) populateOldStack();
		return o.pop();
	}
	
	//print oldest value
	public T peek(){
		if(o.empty()) populateOldStack();
		return o.peek();
	}
	
	public void populateOldStack(){
		while(!n.empty()){
			o.push(n.pop());
		}
	}
}

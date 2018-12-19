package RunningMedian;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.*;

public class Solution {
	
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Heap heap = new Heap();
        for(int a_i=0; a_i < n; a_i++){
            heap.add(in.nextInt());
            
        }
        
        
    }
	
	public static class Heap{
		PriorityQueue<Integer> high; // .peek/.poll will return highest number. represents top half of array
		PriorityQueue<Integer> low; // .peek/.poll will return lowest number. represents bottom half of array
		
		public Heap(){
			this.high = new PriorityQueue<Integer>();
			this.low = new PriorityQueue<Integer>(Collections.reverseOrder());
		}
		
		public void add(Integer value){
			if(high.isEmpty() || low.isEmpty()){
				addFirstRun(value);
				printMedian();
				return;
			}
			
			if(high.size() > low.size()){
				if(value < high.peek()) {
					low.add(value);
				} else{
					swapWithLow(value);
				}
			} else{
				if(value >= low.peek()){
					high.add(value);
				} else{
					swapWithLow(value);
				}
			}
			printMedian();
			return;
		}
		
		public void addFirstRun(Integer value){
			if(high.isEmpty()){  //add to high queue on first add
				high.add(value);
			} else { //second add
				if(value <= high.peek()){ 
					low.add(value);
				} else{
					swapWithHigh(value);
				}
			}
		}
		
		public void swapWithLow(Integer value){
			int temp = low.poll();
			high.add(temp);
			low.add(value);
		}
		
		public void swapWithHigh(Integer value){
			int temp = high.poll();
			low.add(temp);
			high.add(value);
		}
		
		public void printMedian(){
			if(high.size() > low.size()) System.out.println(high.peek().floatValue());
			else{
				float avg = (low.peek().floatValue() + high.peek().floatValue())/2;
				System.out.println(avg);
				
			}
		}
	}

}
package MergeSortCountingInversions;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	static long swaps = 0; // incase # of swaps is larger than INTEGER.MAX
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int d = in.nextInt();
		for(int i = 0; i < d; i++){
			
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int j = 0; j < n; j++){
			arr[j] = in.nextInt();
		}
		mergeSort(arr);
		System.out.println(swaps);
		}
		
	}
	
	public static void mergeSort(int[] arr){
		swaps = 0; //reset swaps
		mergeSort(arr, new int[arr.length], 0, arr.length-1);
	}
	
	public static void mergeSort(int[] arr, int[] temp, int leftStart, int rightEnd){
		if(leftStart >= rightEnd){ //can't split into smaller arrays
			return;
		}
		
		int middle = (leftStart + rightEnd)/2;
		
		mergeSort(arr, temp, leftStart, middle); //recursive sort on left half
		mergeSort(arr, temp, middle+1, rightEnd); //recursive sort on right half
		mergeHalves(arr, temp, leftStart, rightEnd);
	}
	
	public static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd){
		int leftEnd = (leftStart + rightEnd) / 2; // end index of left array
		int rightStart = leftEnd + 1; // start index of right array
		int size = rightEnd - leftStart + 1; // size of combined left/right arrays
		
		int left = leftStart; // indicates left most index of left array which hasn't been merged into temp array
		int right = rightStart; //indicates left most index of right array which hasn't been merged into temp array
		int index = leftStart; //index in temp array to place next value
		
		while(left <= leftEnd && right <= rightEnd){
			if(arr[left] <= arr[right]){
				temp[index] = arr[left];
				left++;
			} else{
				temp[index] = arr[right];
				right++;
				swaps += 1 + leftEnd - left;
			}
			index++;
		}
		
		System.arraycopy(arr, left, temp, index, leftEnd - left + 1); //copies rest of left array into temp array
		System.arraycopy(arr, right, temp, index, rightEnd - right + 1); // copies rest of right array into temp array
		System.arraycopy(temp, leftStart, arr, leftStart, size); // copies merged left/right arrays back into original array
		
		
	}

}

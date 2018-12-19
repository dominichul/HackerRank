package Arrays.DynamicArray;

import java.io.*;
import java.util.*;

public class Solution {
	
	public static int lastAnswer = 0;
	public static int N;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        N = in.nextInt();
        int q = in .nextInt();
        int[] query = new int[3];
        
        ArrayList<ArrayList<Integer>> seqList = new ArrayList<ArrayList<Integer>>(N);
        for(int i = 0; i < N; i++) { seqList.add(new ArrayList<Integer>());}
        
        for(int i = 0; i < q; i++) {
        	query[0] = in.nextInt();
        	query[1] = in.nextInt();
        	query[2] = in.nextInt();
        	seqList = processQuery(seqList, query);
        }
        in.close();
    }
    
    public static ArrayList<ArrayList<Integer>> processQuery(ArrayList<ArrayList<Integer>> seqList, int[] query){
    	int seq = (query[1]^lastAnswer)%N; //calculate index to find target sequence
    	if(query[0] == 1) {	//append to sequence
    		seqList.get(seq).add(query[2]);
    	} else {	//calculate element in sequence. set lastAnswer to sequence at element's index and print.
    		int element = query[2] % seqList.get(seq).size();
    		lastAnswer = seqList.get(seq).get(element);
    		System.out.println(lastAnswer);
    	}
    	
    	return seqList;
    }
}
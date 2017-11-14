package BFSShortestReachInAGraph;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	public static class Node{
		int id;
		LinkedList<Node> children;
		
		public Node(int id){
			this.id = id;
			this.children = new LinkedList<Node>();
		}
		
		public void add(Node node){
			children.add(node);
		}
	}
	
    public static class Graph {
        
    	Node[] nodes;
    	int[] distances;
        
        public Graph(int size) {
        	nodes = new Node[size];
        	distances = new int[size];
            for(int i = 0; i < size; i++){
            	nodes[i] = new Node(i);
            }
        }

        public void addEdge(int first, int second) {
            nodes[first].add(nodes[second]);
            nodes[second].add(nodes[first]);
        }
        
        public int[] shortestReach(int startId) { // 0 indexed
        	int reach = 6;
        	
        	for(int i = 0; i < distances.length; i++){
        		distances[i] = -1;
        	}
        	
        	LinkedList<Node> toVisit = new LinkedList<Node>();
        	HashSet<Node> visited = new HashSet<Node>();
        	
        	visited.add(nodes[startId]);
        	
        	for(Node child : nodes[startId].children){
        		toVisit.add(child);
        	}
        	
        	while(!toVisit.isEmpty()){
        		int count = toVisit.size();
        		for(int i = 0; i < count; i++){
        			if(visited.contains(toVisit.peekFirst())){
        				toVisit.remove();
        			}else {
        				visited.add(toVisit.peekFirst());
        				for(Node child : toVisit.peekFirst().children){
        					toVisit.add(child);
        				}
        				distances[toVisit.remove().id] = reach;
        				
        			}
        		}
        		reach += 6;
        	}
        	
        	
        	return distances;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        
        for (int t = 0; t < queries; t++) {
            
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);
 
            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }
        
        scanner.close();
    }
}
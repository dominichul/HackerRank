package BSTInsertion;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args){
		Node root = new Node(12);
		root.left = new Node(4);
		root.right = new Node(19);
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++){
			root = Insert(root, scan.nextInt());
		}
		
		printTreePreOrder(root);
		scan.close();
	}
	
	public static void printTreePreOrder(Node node){
		if(node == null) return;
		
		printTreePreOrder(node.left);
		System.out.format( " %d ", node.data);
		printTreePreOrder(node.right);
	}
	
	public static Node Insert(Node root, int value){
		Node currNode;
		if(value >= root.data){
			if(root.right != null){
				currNode = Insert(root.right, value);
			} else {
				Node newNode = new Node();
				newNode.data = value;
				root.right = newNode;
			}
		}
		else if (value < root.data)
			if(root.left != null){
				currNode = Insert(root.left, value);
			} else {
				Node newNode = new Node();
				newNode.data = value;
				root.left = newNode;
			}
		return root;
	}
	

}

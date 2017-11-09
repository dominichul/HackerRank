package Contacts;

import java.util.HashMap;

public class Node {
	HashMap<Character, Node> children;
	boolean isVisited;
	char data;
	int wSize;
	
	public Node(){ 
		children = new HashMap<Character, Node>(); 
		}
	
	public Node(char data){
		this.data = data;
		this.wSize = 0;
		children = new HashMap<Character, Node>();
	}
	
	public void addChild(Node child){
		children.put((Character)child.getData(), child);
	}

	public void incrSize(){ wSize++; }
	
	public char getData(){ return data; }
	
	public HashMap<Character,Node> getChildren(){ return children; }
}

package Contacts;

public class TreeBuilder {
	Node root;
	
	public TreeBuilder(){ root = new Node();}
	
	public void addWord(String word){
		Node currNode = root;
		
		for(int i = 0; i < word.length(); i++){
			if(currNode.getChildren().get(word.charAt(i)) == null){
				currNode.addChild(new Node(word.charAt(i)));
			}
			
			currNode = currNode.getChildren().get(word.charAt(i));
			currNode.incrSize();
		}
	}
	
	public void printPartialCount(String prefix){
		Node currNode = root;
		
		for(int i = 0; i < prefix.length(); i++){
			if(currNode.getChildren().get(prefix.charAt(i)) == null){
				System.out.println(0);
				return;
			}
			currNode = currNode.getChildren().get(prefix.charAt(i));
		}
		System.out.println(currNode.wSize);
	}
	
	public void printTree(Node node){
		for (Character key : node.getChildren().keySet()){
			System.out.println(key);
			printTree(node.getChildren().get(key));
		}
	}
	
	public Node getRoot(){ return root; }

}

package CTCI;

public class Tree {

	private class Node{
		Node leftTree;
		Node rightTree;
		int value;
	}
	
	
	public void makeTree(Node n, int value){
		if(n.leftTree== null && n.rightTree== null){
			n.leftTree= new Node();
			n.rightTree= new Node();
			n.value= value;
		}
		else{
			if(n.value<value){
				makeTree(n.rightTree, value);
			}
			else{
				makeTree(n.leftTree, value);
			}
		}
			
	}
	public void inOrder(Node n){
		if(n.value != 0){
			inOrder(n.leftTree);
			System.out.println(n.value);
			inOrder(n.rightTree);
		}
	}
	public void postOrder(Node n){
		if(n.value != 0){
			postOrder(n.leftTree);
			postOrder(n.rightTree);
			System.out.println(n.value);
		}
	}
	public void preOrder(Node n){
		if(n.value != 0){
			System.out.println(n.value);
			preOrder(n.leftTree);
			preOrder(n.rightTree);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t= new Tree();
		Tree.Node n= t.new Node();
		t.makeTree(n, 5);
		t.makeTree(n, 6);
		t.makeTree(n, 3);
		t.makeTree(n, 2);
		t.makeTree(n, 8);
		t.makeTree(n, 1);
		t.makeTree(n, 7);
		t.makeTree(n, 4);
		t.makeTree(n, 9);
		System.out.println("Inorder");
		t.inOrder(n);
		System.out.println("Post Order");
		t.postOrder(n);
		System.out.println("pre Order");
		t.preOrder(n);
		
		
	}

}

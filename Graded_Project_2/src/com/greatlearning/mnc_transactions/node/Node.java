package com.greatlearning.mnc_transactions.node;

public class Node {
	
	public int data;
	public Node leftNode, rightNode;
	
	public Node(int key){
		data=key;
		leftNode=rightNode=null;
	}
	
}

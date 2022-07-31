package com.greatlearning.mnc_transactions.node;

public class Node {
/**
* @author sohanDesai
* 
*/
	public int data;
	public Node leftNode, rightNode;

	/*
	 * constructor initializes node with provided key
	 * leftNode and rightNode are set to NULL
	 */
	public Node(int key){
		data=key;
		leftNode=rightNode=null;
	}

}

/**
 * 
 */
package com.greatlearning.mnc_transactions.services;

import com.greatlearning.mnc_transactions.node.Node;

/**
 * @author sohanDesai
 *
 */
public class BSTToRightSkewedTree {

	public Node skewedRoot=null;									//root for Right Skewed Tree
	public Node prevNode=null;										//traces previous node in Right Skewed Tree

	/*
	 * function inserts a new node in the BST with provided key
	 * 
	 * if root is null then it is initialized with given key and returned
	 * 
	 * else if (key < root.data) -> traverse to the leftNode
	 * else if (key > root.data) -> traverse to the rightNode
	 * 
	 * keep traversing until current root==null.
	 * Intitalize root with given key. Return root
	 */
	public Node insertNode(Node root, int key) {
		if(root==null)
			return new Node(key);

		if(root.data>key)
			root.leftNode = insertNode(root.leftNode, key);

		else if(root.data<key)
			root.rightNode = insertNode(root.rightNode, key);

		return root;
	}

	/*
	 * function creates a Right Skewed Tree of ascending order from given BST
	 * uses inorder traversal
	 */
	public void convertToRightSkewed(Node root) {

		if(root==null) {
			return;
		}
		
		//traverse to leftNode
		convertToRightSkewed(root.leftNode);

		/*
		 * if skewedRoot is null then tree needs to be created
		 * Make the current root as skewedRoot
		 * leftNode of current root is set to NULL
		 * prevNode is set to current root
		 */
		if(skewedRoot==null) {
			skewedRoot=root;
			root.leftNode=null;
			prevNode=root;
		}
		
		/*
		 * else a tree already exists
		 * simply add current root as rightNode of prevNode
		 * leftNode of current root is set to NULL
		 * update prevNode as current root
		 */
		else {
			prevNode.rightNode=root;
			root.leftNode=null;
			prevNode=root;
		}
		
		//traverse to rightNode
		convertToRightSkewed(root.rightNode);
	}

	/*
	 * prints Right Skewed Tree
	 */
	public void rightSkewedTraversal(Node root) {
		
		//if root is null then simply return. Tree doesn't exist
		if(root==null) {
			return;
		}
		
		//else print data of current root and move on to the rightNode
		System.out.print(root.data +" ");
		rightSkewedTraversal(root.rightNode);
	}

}

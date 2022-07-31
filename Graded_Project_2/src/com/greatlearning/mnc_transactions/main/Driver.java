/**
 * 
 */
package com.greatlearning.mnc_transactions.main;
import com.greatlearning.mnc_transactions.node.*;
import com.greatlearning.mnc_transactions.services.BSTToRightSkewedTree;
/**
 * @author sohanDesai
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=null;
		BSTToRightSkewedTree bstRightSkewed = new BSTToRightSkewedTree();
		
		//insertion of nodes to create a Binary search tree
		root = bstRightSkewed.insertNode(root, 50);
		root = bstRightSkewed.insertNode(root, 30);
		root = bstRightSkewed.insertNode(root, 60);
		root = bstRightSkewed.insertNode(root, 10);
		root = bstRightSkewed.insertNode(root, 55);
		
		//converts BST into a Right Skewed Tree of ascending order
		bstRightSkewed.convertToRightSkewed(root);
		
		//prints the Right Skewed Tree using Right Skewed Traversal
		System.out.println("Result: ");
		bstRightSkewed.rightSkewedTraversal(bstRightSkewed.skewedRoot);
		System.out.println();
	}

}

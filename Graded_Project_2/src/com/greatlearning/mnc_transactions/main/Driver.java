/**
 * 
 */
package com.greatlearning.mnc_transactions.main;
import com.greatlearning.mnc_transactions.node.*;
import com.greatlearning.mnc_transactions.services.BSTToRightSkewedTree;
/**
 * @author sohan
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
		
		root = bstRightSkewed.insertNode(root, 50);
		root = bstRightSkewed.insertNode(root, 30);
		root = bstRightSkewed.insertNode(root, 60);
		root = bstRightSkewed.insertNode(root, 10);
		root = bstRightSkewed.insertNode(root, 55);
		root = bstRightSkewed.insertNode(root, 20);
		root = bstRightSkewed.insertNode(root, 35);
		bstRightSkewed.convertToRightSkewed(root);
		
		System.out.println("Result:");
		bstRightSkewed.rightSkewedTraversal(bstRightSkewed.skewedRoot);
		System.out.println();
	}

}

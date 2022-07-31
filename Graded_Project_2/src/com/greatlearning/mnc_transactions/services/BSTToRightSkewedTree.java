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

	public Node skewedRoot=null;
	public Node prevNode=null;

	public Node insertNode(Node root, int key) {
		if(root==null)
			return new Node(key);

		if(root.data>key)
			root.leftNode = insertNode(root.leftNode, key);

		else if(root.data<key)
			root.rightNode = insertNode(root.rightNode, key);

		return root;
	}

	public void convertToRightSkewed(Node root) {

		if(root==null) {
			return;
		}

		convertToRightSkewed(root.leftNode);

		if(skewedRoot==null) {
			skewedRoot=root;
			root.leftNode=null;
			prevNode=root;
		}
		else {
			prevNode.rightNode=root;
			root.leftNode=null;
			prevNode=root;
		}

		convertToRightSkewed(root.rightNode);
	}

	public void rightSkewedTraversal(Node root) {

		if(root==null) {
			return;
		}

		System.out.print(root.data +" ");
		rightSkewedTraversal(root.rightNode);
	}

}

/**
 * 
 */
package com.greatlearning.constructionfloororder.service;

import java.util.Queue;
import java.util.Stack;

/**
 * @author sohanDesai
 *
 */
public class ConstructionFloorLogic {
	Stack<Integer> floorStack = new Stack<>();
	Stack<Integer> temp = new Stack<>();
	
	public void printOrder(Queue<Integer> queue1, int count) {
		int floors=count;
		for(int i=1; i<=count; i++) {
			System.out.println("Day: " +i);
			floors=floorOrder(queue1, floors);
		}
	}
	
	public int floorOrder(Queue<Integer> queue1, int count) {
		// TODO Auto-generated method stub
		if(queue1.peek()==count) {
			System.out.print(queue1.poll() +" ");
			count--;
			while(!floorStack.isEmpty() && floorStack.peek()==count) {
				System.out.print(floorStack.pop() +" ");
				count--;
			}
		}
		else {
			while((!floorStack.isEmpty()) && (floorStack.peek()>queue1.peek()))
				temp.push(floorStack.pop());
			floorStack.push(queue1.poll());
			while(!temp.isEmpty())
				floorStack.push(temp.pop());
		}
		System.out.println();
		return count;
	}

}

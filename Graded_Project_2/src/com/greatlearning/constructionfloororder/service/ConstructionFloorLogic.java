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
	Stack<Integer> floorStack = new Stack<>();			//to store the floor numbers in waiting
	Stack<Integer> temp = new Stack<>();				//temporary stack used for sorting in descending order
	
	public void printOrder(Queue<Integer> queue1, int count) {
		int floors=count;												//floors = total number of floors
		for(int i=1; i<=count; i++) {									//count keeps track of number of days
			System.out.println("Day: " +i);
			floors=floorOrder(queue1, floors);							//floors = updated largest floor number
		}
	}
	
	public int floorOrder(Queue<Integer> queue1, int count) {
		// TODO Auto-generated method stub
		if(queue1.peek()==count) {
			System.out.print(queue1.poll() +" ");							//print floor if number equals updated largest floor number
			count--;														//decrement largest floor number by 1
			
			/*
			 * print floor while top of stack equals updated largest floor number
			 *  and decrement largest floor number by 1
			 */
			while(!floorStack.isEmpty() && floorStack.peek()==count) {
				System.out.print(floorStack.pop() +" ");
				count--;
			}
		}
		
		/*
		 * else push the floor number onto the stack. Floors are stored in descending order. 
		 * 
		 * Any floor number that is larger than the one to be pushed is stored in a temporary stack
		 * the intended floor number is then pushed to the stack followed by successive insertion
		 * of floor numbers in temporary stack
		 */
		else {
			while((!floorStack.isEmpty()) && (floorStack.peek()>queue1.peek()))
				temp.push(floorStack.pop());
			floorStack.push(queue1.poll());
			while(!temp.isEmpty())
				floorStack.push(temp.pop());
		}
		
		System.out.println();
		return count;														//return the updated largest floor number
	}

}

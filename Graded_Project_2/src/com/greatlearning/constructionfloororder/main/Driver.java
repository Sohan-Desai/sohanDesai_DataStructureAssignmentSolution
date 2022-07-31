/**
 * 
 */
package com.greatlearning.constructionfloororder.main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import com.greatlearning.constructionfloororder.service.*;
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
		ConstructionFloorLogic cFLogic = new ConstructionFloorLogic();
		Scanner scan = new Scanner(System.in);
		Queue<Integer> queue1 = new LinkedList<Integer>();
		System.out.println("Enter the total number of floors in the building:");
		int floors = scan.nextInt();
		int element;
		System.out.println("--------------------------------------------");
		for(int i=1;i<=floors;i++) {
			System.out.println("Enter the floor size given on day : " +i);
			element=scan.nextInt();
			queue1.add(element);
		}
		System.out.println("--------------------------------------------");
		System.out.println("\nThe order of construction is as follows:\n");
		cFLogic.printOrder(queue1, floors);
		scan.close();
	}

}

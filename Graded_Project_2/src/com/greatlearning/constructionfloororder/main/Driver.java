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
		
		//Getting total number of floors from the user
		System.out.println("Enter the total number of floors in the building:");
		int floors = scan.nextInt();
		int element;
		System.out.println("--------------------------------------------");
		
		/*
		 * the floor sizes must be unique ranging from 1 to the total number
		 * of floors entered.
		 * floor sizes can be entered in random order however they must all
		 * be entered only once
		 * 
		 * floor sizes get stored in queue1
		 */
		for(int i=1;i<=floors;i++) {
			System.out.println("Enter the floor size given on day : " +i);
			element=scan.nextInt();
			queue1.add(element);
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("\nThe order of construction is as follows:\n");
		
		/*
		 * prints the floor sizes in descending order starting from largest number
		 * Any floor number (except maximum) gets printed only after the floor number immediately 
		 * bigger than it is printed.
		 * Else it skips the days until the required floor number is entered.
		 * 
		 * Construction will always take number of days equal to the number of floors to be built
		 */
		cFLogic.printOrder(queue1, floors);
		scan.close();
	}

}

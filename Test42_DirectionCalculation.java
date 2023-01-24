package com.app_partice;

import java.util.Scanner;

/*
 A man walks 5 km toward south and then turns to the right. After walking 3 km he turns to the left 
 and walks 5 km. Now in which direction is he from the starting place
 
	input1: south:5,right:3,left:5  output: south-west 

 */
public class Test42_DirectionCalculation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Starting Direction:like(South,East,North,West):");
		String dir=sc.nextLine();
				
		switch(dir) {
		case "South":{
			System.out.print("Enter the KM The Man Covers:");
			int km=sc.nextInt();
			System.out.print("Enter the Turns the man Took:(like:left or right):");
			String turn=sc.next();
			if(turn.equalsIgnoreCase("right")) {
				System.out.print("After Turn right,what distance Man Covers:");
				int km1=sc.nextInt();
				System.out.print("After distance "+km1+" What Turns the man Took:(like:left or right):");
				String turn1=sc.next();
				if(turn1.equalsIgnoreCase("left")) {
					System.out.print("After Turn Left,what distance man Cover:");
					int km2=sc.nextInt();
					System.out.println("Man in SOUTH_WEST Direction");
				}
			}else {
				System.out.print("After Turn left,what distance Man Covers:");
				int km1=sc.nextInt();
				System.out.print("After distance "+km1+" What Turns the man Took:(like:left or right):");
				String turn1=sc.next();
				if(turn1.equalsIgnoreCase("right")) {
					System.out.print("After Turn Right,what distance man Cover:");
					int km2=sc.nextInt();
					System.out.println("Man in SOUTH_EAST Direction");
				}
			}
			break;
		}
		case "West":{
			break;
		}
		
		case "North":{
			break;
		}
			
		case "East":{
			
		}
		default:{
			System.out.println("Invalid Direction Entry");
			break;
		}
			
		
			
		}
	
		
		
	}

}

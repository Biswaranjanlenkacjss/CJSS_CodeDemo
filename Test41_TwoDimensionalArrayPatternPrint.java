package com.app_partice;

import java.util.Scanner;

/*
 Create a 2 dimensional array of size 5 x 6, store values like shown below and print them
2 4  6  8  10 12 
3 6  9  12 15 18 
4 8  12 16 20 24 
5 10 15 20 25 30 
6 12 18 24 30 36 
 */
public class Test41_TwoDimensionalArrayPatternPrint {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Row size for two dimensional Array:");
		int row=sc.nextInt();
		System.out.print("Enter the Column size for two dimensional Array:");
		int column=sc.nextInt();
		int[][] array=new int[row][column];
		
		//k for 1 to 6 value multiply with 2 		
		int x=2; //to multiplication
		
  //Approach-1
  //==========	
		/*
	  for(int i=0;i<row;i++) {
		    int k=1;
			  for(int j=0;j<column;j++) {
				  array[i][j]=x*k;
				  k=k+1;
				  System.out.print(array[i][j]+" " );
		  }
		  x=x+1;
		  System.out.println();
	  }
     */
		
  //Approach-2
 //============
		
		/*
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				for(int k=j+1;k<=6;k++) {
					array[i][j]=x*k;
					System.out.print(array[i][j]+" ");
					break;
				}
			}
			x=x+1;
			System.out.println();
		}
		
		*/
		
		//Approach-3
		//=============
		for(int i=0;i<row;i++) {
			for(int j=0,k=1;j<column && k<=6;j++,k++) {			
					array[i][j]=x*k;
					System.out.print(array[i][j]+" ");				
				
			}
			x=x+1;
			System.out.println();
		}
	}

}

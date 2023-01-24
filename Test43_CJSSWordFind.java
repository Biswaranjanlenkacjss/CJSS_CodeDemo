package com.app_partice;

import java.util.Scanner;

/*
 *Find out how many "CJSS" words can be formed  with the letter from the given input
	input 1    : CATS ARE SO BEAUTIFUL. I AM JOYFUL.			
    Output 1 : 1
	input 2    : HEY CHOLE, CJSS IS AWESOME. JAUNTY TO BE PART OF IT.		
     Output 2 : 2

 */
public  class Test43_CJSSWordFind {

	public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter the String:(All the Alphabets Should be Capital):");
	 String string=scanner.nextLine();
	 String str=string.toUpperCase();
	 //StringBuilder stringBuilder=new StringBuilder();
	 
	 int countC=0;
	 int countJ=0;
	 int countS=0;
	 
	 char[] array=str.toCharArray();//converting String to char Array
	  
	 for(int i=0;i<array.length;i++) {
		 if(array[i]=='C') {
			 countC++;
		 }else if(array[i]=='J') {
			 countJ++;
		 }else if(array[i]=='S') {
			 countS++;
		 }
	 }
	 
	 System.out.println("C="+countC+",J="+countJ+",S="+countS);
	 int cofcientS=countS/2;

	 if(countC<countJ && countC<cofcientS) {
		 System.out.println("(1st)No Of CJSS can be formed:"+countC );
	 }else if(countJ<countC && countJ<cofcientS) {
		 System.out.println("(2nd)No Of CJSS can be formed:"+countJ );
	 }else {
		 System.out.println("(3rd)No Of CJSS can be formed:"+cofcientS );
	 }
	
	 

	}//end of main

}

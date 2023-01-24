package com.app_partice;

/*
JAF, JEF, JIF, JOF, ? , KAG, KEG, ?, ?, ?....., LUH
	a. Print the above series completely for the letter starting from 'J' to 'L'
		explanation: The middle letters which are vowels have an increasing trend of A, E, I, O,U 
	b. Now for the above series print the output should be 17, 21, ....
		explanation: (10+1+6), (10+5+6), .....

 */
public class Test40_PrintThePattern {

	public static void main(String[] args) {
		char firstOccurance='J'; //For Start with J
		char lastOccurance='L';  //Upto L
		
		char[] vowels={'A','E','I','O','U'}; //Vowels are Common
		
		
		
	/*	
	  Approach-1
	  ============
		String strLetter=""; //To add the series of alphabet
		String strNumber=""; //To add the corresponding Number with sum
		
		for(char letter=firstOccurance; letter<=lastOccurance;letter++) {
			for(char vowel:vowels) {
				strLetter+=" "+letter+vowel+(char)(letter-4)+",";
			}
			
			for(char vowel:vowels) {
				strNumber+=(int)(letter-'A'+1)+(int)(vowel-'A'+1)+(int)(letter-'A'-4+1)+";"+" ";
			}
			
		}
		
		System.out.println("Series of the Alphabet is:");
		System.out.println(strLetter);
		System.out.println();
		System.out.println("=============================================");
		System.out.println("Series of Sum of Numbers in Each Series Corresponding Occurance is:");
		System.out.println(strNumber);
		
		*/
		
		// Approach-2
		//============
		/*
		StringBuilder sbAlphabet=new StringBuilder();
		StringBuilder sbNumber=new StringBuilder();
		
		for(char letter=firstOccurance; letter<=lastOccurance;letter++) {
			
			for(char vowel:vowels) {
				sbAlphabet.append(" "+letter+vowel+(char)(letter-4)+",");
			}
			
			for(char vowel:vowels) {
				sbNumber.append((int)(letter-'A'+1)+(int)(vowel-'A'+1)+(int)(letter-'A'-4+1)+";"+" ");
			}
			
			
		}
		
		System.out.println("Series of the Alphabet is:");
		System.out.println(sbAlphabet);
		System.out.println();
		System.out.println("=============================================");
		System.out.println("Series of Sum of Numbers in Each Series Corresponding Occurance is:");
		System.out.println(sbNumber);
	   */
		
		
		//Approach-3
		//==========
		
		String str="";
		for(char c1='J',c3='F';c1<='l' && c3<='H';c1++,c3++) {
			for(char c2='A'; c2<='Z';c2++) {
				if(c2=='A'|| c2=='E'||c2=='I'||c2=='O'||c2=='U') {
					str=str+c1+c2+c3+" ";
				}
			}
			
		}
		
		System.out.println("The Series is:");
		System.out.println(str);
		String[] words=str.split(" ");
		System.out.println("===============================================================================");
		System.out.println("The Sum is:");
		for(String s:words) {
			int sum=0;
			for(int i=0;i<s.length();i++) {
				sum=sum+s.charAt(i)-'@'; //Ascci Value of '@'=64
			}
		
			System.out.print(sum+"   ");
		}
		
	}

}

/*
 output
 =======
 Series of the Alphabet is:
 JAF, JEF, JIF, JOF, JUF, KAG, KEG, KIG, KOG, KUG, LAH, LEH, LIH, LOH, LUH,

=============================================
Series of Sum of Numbers in Each Series Corresponding Occurance is:
17; 21; 25; 31; 37; 19; 23; 27; 33; 39; 21; 25; 29; 35; 41; 

*/

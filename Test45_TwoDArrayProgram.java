/*
 JLQ7: 
A.. For the below matrix find out the cell having ‘1’. Now replace the entire row and column 
with ‘0’ in which that cell is available.
input:
a b c d e f
3 t 1 k r s
a d i l q t
b e h m p a
c f g n r b

output:
a b 0 d e f 
0 0 1 0 0 0 
a d 0 l q t 
b e 0 m p a 
c f 0 n r b 

 */
package com.app_partice;
public class Test45_TwoDArrayProgram {
	public static void main(String[] args) {
	  //Take the two Array of row=5,column=6
	 char[][] array= {{'a','b','c','d','e','f'},{'3','t','1','k','r','s'},
			          {'a','d','i','l','q','t'},{'b','e','h','m','p','a'},
			          {'c','f','g','n','r','b'}};
	 
	//Loop For manipulate the Array 
	 for(int i=0;i<=4;i++) {
		 for(int j=0;j<=5;j++) {
			 if(array[i][j]=='1') {
				 for(int k=i,l=0;l<=5;l++) {
					 if(l!=2) {
						array[k][l]='0';
					 }
				 }
				 
				 for(int m=0,n=j;m<=4;m++) {
					 if(m!=1) {
						 array[m][n]='0';
					 }
				 }
			 }
		 }//j loop(column)
	 }//i loop(row)
	 
	 //For Printing the final array
	 System.out.println("The Elements are after Replacing 0 are:");
	 for(int i=0;i<=4;i++) {
		 for(int j=0;j<=5;j++) {
			 System.out.print(array[i][j]+" ");
		 }
		 System.out.println();
	 }

	}

}

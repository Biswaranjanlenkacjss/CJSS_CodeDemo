/*
   For the below matrix find out the cell having ‘1’. Now replace the entire diagonal cell of that
    with ‘0’ in which that cell is available.
    
 Input
 =======
 a b c d e f
 3 t z k r s
 a d i l q t
 b e 1 m p a
 c f g n r b 
 
 output
 =======
a b c d e 0 
0 t z k 0 s 
a 0 i 0 q t 
b e 1 m p a 
c 0 g 0 r b 

 */
package com.app_partice;

public class Test46_TwoDArrayDiaognal {

	//2-D Array of row=5,column=6
	public static void main(String[] args) {
		 char[][] array= {{'a','b','c','d','e','f'},{'3','t','z','k','r','s'},
		          {'a','d','i','l','q','t'},{'b','e','1','m','p','a'},
		          {'c','f','g','n','r','b'}};

//Loop For manipulate the Array 
for(int i=0;i<=4;i++) { 
	 for(int j=0;j<=5;j++) {
		 if(array[i][j]=='1') {
			 for(int k=1,l=0;k<=4 && l<=3;k++,l++) {
				 if(k!=3 && l!=2) {
					array[k][l]='0';
				 }
			 }
			 
			 for(int m=4,n=1;m>=0 && n<=5;m--,n++) {
				 if(m!=3 && n!=2) {
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

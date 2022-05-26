
//Program to print pyramid of stars based on row no. given by user.

package java_loop;

import java.util.Scanner;

public class user_row_pyramid {

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row for pyramid:");
		int row=sc.nextInt();  //row = 3
		
		for(i=1; i<=row; i++) {
			
			//for loop for blank space
			for(j=i;j<=row-1;j++)
			{
				System.out.print(" ");
			}
			//for loop for inner loop
			for(j=1;j<=2*i-1;j++)  //OR j<2*i
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

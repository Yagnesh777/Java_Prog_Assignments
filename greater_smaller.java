
//Program to find greater or smaller no. among the array elements

package array;

import java.util.Scanner;

public class greater_smaller {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size, i;
		
		//taking size of array 
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		
		int[] marks = new int[size];
		
		//loop for taking array elements from user
		System.out.println("Enter the elements for array:");
		for(i=0; i<size; i++) {
			marks[i] = sc.nextInt();
		}
		
		//GREATER NO.
		
		//loop for finding greater no.
		int extra = marks[0];
		for(i=0; i<size; i++) {
			if(extra < marks[i]) {
				extra = marks[i];
			}
		}
		System.out.println("The greater no. is "+extra);
		
		//SMALLER NO.
		
		//loop for finding smaller no.
		int extra2 = marks[0];
		for(i=0; i<size; i++) {
			if(extra2 > marks[i]) {
				extra2 = marks[i];
			}
		}
		System.out.println("The smaller no. is "+extra2);

	}

}

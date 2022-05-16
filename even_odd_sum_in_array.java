
//Program to display sum of even and odd (separated) from an array

package array;

import java.util.*;

public class even_odd_sum_in_array {

	public static void main(String[] args) {
		
		//Taking the size of array
		Scanner sc = new Scanner(System.in);
		int size, i;
		System.out.println("Enter the no. of integers:");
		size = sc.nextInt();
		
		
		//Entering the values in array
		int[] integer = new int[size];
		System.out.println("Enter "+size+" integers:");
		for(i=0; i<size; i++) {
			integer[i] = sc.nextInt();
		}
		
		
		//displaying the values entered in array
		System.out.print("You entered :\t");
		for(i=0; i<size; i++) {
			System.out.print(integer[i]+"\t");
		}
		System.out.println();
		
		
		//for summing even and odd values
		int even = 0, odd = 0;
		for(i=0; i<size; i++) {
			if(integer[i]%2==0) {
				even=even+integer[i];
			}
			else {
				odd=odd+integer[i];
			}
		}
		System.out.println("Sum of even integers are: "+even);
		System.out.println("Sum of odd integers are: "+odd);
		
		
		//for specifying the no. of even/odd integers
		int even_no = 0, odd_no = 0;
		for(i=0; i<size; i++) {
			if(integer[i]%2==0) {
				even_no=even_no+1;
			}
			else {
				odd_no=odd_no+1;
			}
		}
		System.out.println();
		System.out.println("The no. of even integers are: "+even_no);
		System.out.println("The no. of odd integers are: "+odd_no);
		
	}

}

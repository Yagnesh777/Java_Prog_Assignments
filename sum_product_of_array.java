package array;

import java.util.Scanner;

public class sum_product_of_array {

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
		
		//for sum/product of array elements
		int sum=0, prod=1;
		for(i=0; i<size; i++) {
			sum=sum+integer[i];
			prod=prod*integer[i];
		}
		System.out.println("the sum of integers are: "+sum);
		System.out.println("the product of integers are: "+prod);

	}

}

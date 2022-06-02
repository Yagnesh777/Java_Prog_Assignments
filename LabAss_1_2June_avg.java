//Program to findout average of 10 numbers

import java.util.Scanner;

public class LabAss_1_2June_avg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int i, avg, num=0;
		System.out.println("Enter 10 integers to findout average:");
		
		for(i=0; i<10; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(i=0; i<10; i++) {
			num = num + arr[i];
		}
		
		avg=num/10;
		System.out.println("Average of the integers is "+avg);
	}

}

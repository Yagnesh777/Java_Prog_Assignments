//Program to display the number range

package java_loop;

import java.util.Scanner;

public class number_range {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, min, max;
		
		System.out.println("Enter min and max value:");
		min=sc.nextInt();
		max=sc.nextInt();
		
		// if user enters 1st no. greater than 2nd no.
		if(min<max) {
			for(i=min; i<=max; i++) {
				System.out.println(i);
			}
		} 
		// if user enters 2nd no. greater than 1st no.
		else if(min>max) {
			for(i=min; i>=max; i--) {
				System.out.println(i);
			}
		}
		// if user enters both values same
		else {
			System.out.println(min);
		}

	}

}

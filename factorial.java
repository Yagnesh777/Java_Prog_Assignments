
//Factorial of user input number

package java_loop;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, fact=1;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);

	}

}

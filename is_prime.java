

//To check if entered number is prime or not

package java_loop;

import java.util.*;

public class is_prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		
		int temp = 0;
		//Prime no. : divisible by 1 and itself
		//So we have to check from range 2 upto (no. - 1)
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				temp=temp+1;
			}
		}
		//We cannot include if-else inside for loop, as it will print statement for each i value.
		//Therefore taking a variable to check for the condition(if is divisible)
		if(temp==0) {
			System.out.println("Is a prime no.");
		}
		else {
			System.out.println("Not a prime no.");
		}
	}

}

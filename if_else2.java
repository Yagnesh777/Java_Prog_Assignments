//Program to accept two numbers from user to find greater number.

import java.util.*;
public class if_else2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter 1st Number:");
		num1 = sc.nextInt();
		System.out.println("Enter 2nd Number:");
		num2 = sc.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+" is greater than "+num2+".");
		} else {
			System.out.println(num2+" is greater than "+num1+".");;
		}

	}

}

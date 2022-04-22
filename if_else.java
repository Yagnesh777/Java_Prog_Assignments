//Program to accept a no. from user divisible by 7 and find its cube.

import java.util.*;
public class if_else {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a divisible number to findout its cube:");
		num = sc.nextInt();
		
		if (num%7==0) {
			System.out.println("The cube of "+num+" is "+(num*num*num)+".");
		} else {
			System.out.println("You have entered invalid number.\nEnter a number divisible by 7.");
		}

	}

}

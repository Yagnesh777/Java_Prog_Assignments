//Program to perform certain tasks using switch case conditional.

import java.util.Scanner;

public class switch_conditional {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice of task to be performed.\n"
				+ "\t1-to identify greater number among 3 numbers..\n"
				+ "\t2-to identify Area of Rectangle.\n"
				+ "\t3-to identify Cube of no. if it is divisible by 7.\n"
				+ "\t4-to identify Rate of Interest for a person.");
		
		int res=sc.nextInt();
		
		switch(res) {
		case 1:
			//Greater number among 3 numbers
			int num1, num2, num3;
			System.out.println("Enter 3 numbers to findout greater number:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=sc.nextInt();
			if(num1 > num2) {
				if(num1 > num3) {
					System.out.println(num1+" is greater than "+num2+" and "+num3+".");
				}else {
					System.out.println(num3+" is greater than "+num1+" and "+num2+".");
				}
			}
			else {
				if(num2 > num3) {
					System.out.println(num2+" is greater than "+num1+" and "+num3+".");
				}else {
					System.out.println(num3+" is greater than "+num1+" and "+num2+".");
				}
			}
			break;
			
		case 2:
			//Area of Rectangle
			int l, b, area;
			System.out.println("Enter length of rectangle:");
			l=sc.nextInt();
			System.out.println("Enter breadth of rectangle:");
			b=sc.nextInt();
			area=l*b;
			System.out.println("Area of Rectangle is "+area+"sqcm.");
			break;
			
		case 3:
			//Cube of no. if it is divisible by 7
			System.out.println("Enter no. divisible by 7 to findout it's cube:");
			int cube=sc.nextInt();
			if(cube%7==0) {
				System.out.println("Cube of "+cube+" is "+cube*cube*cube+".");
			}else {
				System.out.println("Enter a valid number.");
			}
			break;
			
		case 4:
			//Rate of Interest for a person
			System.out.println("Rate of Interest on amount for a person on the basis of their age and gender.");
			System.out.println("Enter your age(in yrs):");
			int age=sc.nextInt();
			System.out.println("Enter your gender(m for male, f for female):");
			//Declaring & initializing a character variable
			//Taking character as user input
			char gen=sc.next().charAt(0);
			//RI: age 60 & above = male:7%, female:7.5%
			//    age below 60 = male,female:5% 
			if(age>=60) {
				if(gen=='m') {
					System.out.println("Rate of Interest is 7%");
				}else if(gen=='f'){
					System.out.println("Rate of Interest is 7.5%");
				}else {
					System.out.println("Enter a valid gender.");
				}
			}
			else if(age<60 && age>1){
				if(gen=='m') {
					System.out.println("Rate of Interest is 5%");
				}else if(gen=='f'){
					System.out.println("Rate of Interest is 5%");
				}else {
					System.out.println("Enter a valid gender.");
				}
			}
			else {
				System.out.println("Enter a valid age.");
			}
			break;
			
		default:
			System.out.println("Please enter a valid choice.");
		
		}

	}

}

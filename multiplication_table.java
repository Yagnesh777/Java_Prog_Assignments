
//Program to display multiplication table of no. taken from user
package java_loop;

import java.util.Scanner;

public class multiplication_table {

	public static void main(String[] args) {
		//1*1=1
		//1*2=2
		Scanner sc = new Scanner(System.in);
		int tab, i, j;
		System.out.println("Enter no. for which you want to display multiplication table:");
		tab=sc.nextInt();
		
		for(i=1; i<=10; i++) {
			
			System.out.println(tab+" * "+i+" = "+tab*i);
		}
	}

}

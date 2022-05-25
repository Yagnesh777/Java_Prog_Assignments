
//Program to demonstrate hybrid inheritance

package OOPS;

import java.util.Scanner;

class Accept {
	int size, i;
	Scanner sc = new Scanner(System.in);
	public int[] user_input() {
		
		//loop for taking size of array
		System.out.println("Enter the number of integers:");
		size=sc.nextInt();
		
		int[] integers = new int[size];
		
		//loop for taking array elements from user
		System.out.println("Enter "+size+" integers:");
		for(i=0; i<size; i++) {
			integers[i] = sc.nextInt();
		}
		
		return integers;
	}
	
}

class Greater extends Accept {
	public void grtr() {
		
		int[] integers = user_input();  //integers in every classes are different
		int extra = integers[0];
		
		//loop for displaying the array elements
		System.out.println("Integers you entered are:");
		for(i=0; i<size; i++) {
			System.out.print(integers[i]+"\t");
		}
		System.out.println();
		//loop for finding greater no.
		for(i=0; i<size; i++) {
			if(extra < integers[i]) {
				extra = integers[i];
			}
		}
		System.out.println("The greater no. is "+extra);
		
		
	}
}

class Average extends Greater {
	public void avg() {
		int[] integers = user_input();
		int temp = 0, avg;
		
		//summing up array elements
		for(i=0; i<size; i++) {
			temp=temp+integers[i];
		}
		
		//calculating average
		avg=temp/size;
		System.out.println("Average of the numbers are: "+avg);
	}
}

class Fibonacci extends Accept {
	public void fibo() {
		int[] digit = user_input();
		int a=0, b=1, c;
		
		System.out.println(a);
		System.out.println(b);
		for(i=0; i<digit[0]-2; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}



public class hybrid_inheritance {

	public static void main(String[] args) {
	
		Average obj2 = new Average();
		obj2.avg();
		obj2.grtr();
	
		Fibonacci obj3 = new Fibonacci();
		obj3.fibo();
		

	}

}

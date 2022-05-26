/* 
 	Program to demonstrate hybrid inheritance.
 	1 class for taking user input. 
 	1 class for finding greater no.(which inherits user input class). 
 	1 class for finding average(which inherits greater class).
 	1 class for finding fibonacci series(which inherits user input class).
*/

package OOPS;

import java.util.Scanner;

// CLASS FOR ACCEPTING USER INPUT
class Accept {
	int size, i;
	Scanner sc = new Scanner(System.in);
	public int[] user_input() {
		
		//loop for taking size of array
		System.out.println("Enter the no. of numbers you want ot take:");
		size=sc.nextInt();
		
		int[] numbers = new int[size];
		
		//loop for taking array elements from user
		System.out.println("Enter "+size+" number/s:");
		for(i=0; i<size; i++) {
			numbers[i] = sc.nextInt();
		}
		
		return numbers;
	}
}


//CLASS FOR FINDING GREATER NO.  (Displays single-level inheritance)
class Greater extends Accept {
	public void grtr() {
		
		int[] numbers = user_input();  //numbers array in every classes are different
		
		//loop for displaying the array elements
		System.out.println("Numbers you entered are:");
		for(i=0; i<size; i++) {
			System.out.print(numbers[i]+"\t");
		}
		System.out.println();
		
		//loop for finding greater no.
		int extra = numbers[0];
		for(i=0; i<size; i++) {
			if(extra < numbers[i]) {
				extra = numbers[i];
			}
		}
		System.out.println("The greater no. is "+extra);
	}
}


//CLASS FOR FINDING AVERAGE  (Displays multi-level inheritance)
class Average extends Greater {
	public void avg() {
		//As the 'greater' is child of 'accept', 'average' can use properties/methods of 'accept' as well.
		int[] numbers = user_input();
		int temp = 0, avg;
		
		//summing up array elements
		for(i=0; i<size; i++) {
			temp=temp+numbers[i];
		}
		
		//calculating average
		avg=temp/size;
		System.out.println("Average of the numbers are: "+avg);
	}
}


//CLASS FOR FINDING FIBONACCI SERIES  (Displays single-level inheritance)
class Fibonacci extends Accept {
	public void fibo() {
		int[] numbers = user_input(); //Here the user must enter 1 element in array
		int a=0, b=1, c;
		
		System.out.println(a);
		System.out.println(b);
		for(i=0; i<numbers[0]-2; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}



public class hybrid_inheritance {

	public static void main(String[] args) {
	
		Average obj1 = new Average();
		obj1.avg();
		
		//We can access 'grtr()' method in 'Greater' class using 'obj1' object of 'Average' class, as 'Average' is child of 'Greater'.
		obj1.grtr();
	
		Fibonacci obj2 = new Fibonacci();
		obj2.fibo();
		
	}
}

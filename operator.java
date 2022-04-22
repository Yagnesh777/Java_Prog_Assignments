// Program to demonstrate various operators.

import java.util.Scanner;
class operator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n, n1, n2, n3, n4, res, res2, res3, res4;
		boolean res1, res5;
		
		System.out.println("Enter a 1st number:");
		n=sc.nextInt();
		System.out.println("Enter a 2nd number:");
		n2=sc.nextInt();
		
		//TERNARY OPERATOR
		res=(n>n2)?n:n2;
		System.out.println("The greater value is ="+res);
		
		
		//UNARY OPERATOR
		System.out.println("Enter a number for increment/decrement operation:");
		n1=sc.nextInt();
		System.out.println("Post increment of "+n1+" is "+(n1++));
		System.out.println("Pre increment of "+(--n1)+" is "+(++n1));	
		System.out.println("Post decrement of "+(--n1)+" is "+(n1--));
		System.out.println("Pre decrement of "+(++n1)+" is "+(--n1));
		
		
		//BINARY OPERATOR
		System.out.println("Enter a 1st number for binary operation :");
		n3 = sc.nextInt();
		System.out.println("Enter a 2nd number for binary operation :");
		n4 = sc.nextInt();
		
		//assignment
		System.out.println(n3+" + "+n4+" = "+(n4+=n3)); 
		n4 -= n3;
		
		//relational
		res1 = n3 >= n4; // res1=boolean variable
		System.out.println(n3+" >= "+n4+" is "+res1); 
		
		//bitwise
		res2 = n3 & n4;
		System.out.println(n3+" bitwise AND "+n4+" = "+res2);
		res3 = n3 | n4;
		System.out.println(n3+" bitwise OR "+n4+" = "+res3);
		res4 = n3 ^ n4;
		System.out.println(n3+" bitwise XOR "+n4+" = "+res4);
		
		//logical
		res5 = (n3>n4)&&(n3>=n4); // res5=boolean variable
		System.out.println("("+n3+" > "+n4+") Logical AND ("+n3+" >= "+n4+") = "+res5);
		
	}
}
/*
WAP Assignment, Conditional, Bitwise, Logical, ++,--, Ternary
*/


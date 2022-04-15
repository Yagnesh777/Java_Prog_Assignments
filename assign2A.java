

import java.util.*;  
class assign2A 
{
	public static void main(String args[]) 
	{
		int num1, num2, res1, res2, res3, res4, res5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		num2 = sc.nextInt();
		
		//Addition
		res1 = num1+num2;    
		System.out.println("The addition of two no.s "+num1+" and "+num2+" is "+res1);
		
		//Subtraction
		res2 = num1-num2;    
		System.out.println("The subtraction of two no.s "+num1+" and "+num2+" is "+res2);
		
		//Multiplication
		res3 = num1*num2;    
		System.out.println("The multiplication of two no.s "+num1+" and "+num2+" is "+res3);
		
		//Division
		res4 = num1/num2;
		System.out.println("The division of two no.s "+num1+" and "+num2+" is "+res4);
		
		//Modulus
		res5 = num1%num2;
		System.out.println("The remainder of two no.s "+num1+" and "+num2+" is "+res5);
	}
}
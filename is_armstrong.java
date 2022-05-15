
//Program to check the number entered by user is armstrong or not

/*153 = 1 to the power of n + 
        5 to the power of n +
        3 to the power of n,  where n is no. of digits in a number
   
  153 = 1*1*1 + 5*5*5 + 3*3*3
 */

package java_loop;

import java.util.*;

public class is_armstrong {

	public static void main(String[] args) {
		//Taking user input
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter a number:");
		num=sc.nextInt();
		
		
		//For obtaining the length of the number
		int n1=num, length=0;
		//Length is defined on the basis of how many times the no. is divisible by 10 
		//Here the division is floor division which is by default in "int" datatype.
		while(n1 != 0) 
		{
			length=length+1;
			n1=n1/10;
		}
		
		
		//For looping the number in reverse format
		int m1=num, rem, arms=0;
		//For obtaining each digit of the number(i.e obtaining remainder each time the loop runs)
		while(m1 != 0) 
		{
			//obtaining the remainder
			rem=m1%10;
			
			//For multiplying the remainder with itself based on length obtained
			int mul=1;
			for(int i=1; i<=length; i++) {
				mul=mul*rem;
			}
			
			//for the remainders( after multiply operation)
			arms=arms+mul;
			
			//providing the condition for while loop(just like in length operation)
			m1=m1/10;
		}
		
		//checking if arms(i.e the no. obtained) is equal to the number entered.
		if(arms==num) {
			System.out.println("It is armstrong no.");
		}
		else {
			System.out.println("Not an armstrong no.");
		}

	}

}

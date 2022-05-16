
//Program to print sequence of armstrong numbers from 1 to 1000

package java_loop;

public class seq_of_armstrong {

	public static void main(String[] args) {
		
		int i, j;
		
		for(i=1; i<=1000; i++) {
			
			//For obtaining the length of the number
			int n1=i, length=0;
			while(n1 != 0) 
			{
				length=length+1;
				n1=n1/10;
			}
			
			
			//For looping the number in reverse format
			int m1=i, rem, arms=0;
			//For obtaining each digit of the number(i.e obtaining remainder each time the loop runs)
			while(m1 != 0) 
			{
				//obtaining the remainder
				rem=m1%10;
				
				//For multiplying the remainder with itself based on length obtained
				int mul=1;
				for(j=1; j<=length; j++) {
					mul=mul*rem;
				}
				
				//for adding the remainders( after power/multiply operation)
				arms=arms+mul;
				
				//providing the condition for while loop(just like in length operation)
				m1=m1/10;
			}
			
			//For displaying the no. if obtained no. is equal to the value of 'i'.
			if(arms==i) {
				System.out.println(i);
			}
			
		}

	}

}

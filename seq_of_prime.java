
//Program to print sequence of prime numbers from 1 to 1000.

package java_loop;

public class seq_of_prime {

	public static void main(String[] args) {
		// 2 for loops to be used. 
		// 1 for specifying range between 1 to 1000. 
		// 1 for checking isPrime or not from that sequence
		int i, j, temp=0;
		for(i=1; i<=1000; i++) { //specifying range
			
			for(j=2; j<=i-1; j++) { //checking isPrime
				
				if(i%j==0) {
					temp=temp+1;
				}
			}
			if(temp==0) { //printing prime numbers
				System.out.println(i);
			}
			else {  //for restoring the value of temp to 0
				temp=0;
			}
			
		}

	}

}

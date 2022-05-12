
//Program to print star pattern
package java_loop;

public class star_pattern {

	public static void main(String[] args) {
		
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		int i, j;
		for(i=1; i<=5; i++) {
			
			//for loop for blank space
			for(j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			//for loop for inner loop
			for(j=1;j<=11-2*i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		    *
//		   * *
//		  * * *
//		 * * * *
//		* * * * *
		
		for(i=1; i<=5; i++) {
			
			//for loop for blank space
			for(j=i;j<=4;j++)
			{
				System.out.print(" ");
			}
			
			//for loop for inner loop
			for(j=1;j<2*i;j++)
			{
				//for blank space in inner loop
				if(j%2==0) {
					System.out.print(" ");
				} 
				//for * in inner loop
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}

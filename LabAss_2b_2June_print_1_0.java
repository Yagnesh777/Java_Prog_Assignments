/*
 Program to print
 1010101
  10101 
   101  
    1   
 */
public class LabAss_2b_2June_print_1_0 {

	public static void main(String[] args) {
		LabAss_2b_2June_print_1_0 obj = new LabAss_2b_2June_print_1_0();
		obj.pattern();

	}
	
	public void pattern() {
		int i, j;
		for(i=1; i<=4; i++) {
			
			for(j=1; j<i; j++) {
				System.out.print(" ");
			}
			
			for(j=1; j<=9-2*i; j++) {
				if(j%2==0) {
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}

}

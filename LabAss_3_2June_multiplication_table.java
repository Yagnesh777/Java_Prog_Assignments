//Program to print multiplication table of 24, 50, 29.
public class LabAss_3_2June_multiplication_table {
	
	int i;
	public static void main(String[] args) {
		LabAss_3_2June_multiplication_table obj = new LabAss_3_2June_multiplication_table();
		obj.t24();
		obj.t50();
		obj.t29();

	}
	public void t24() {
		
		System.out.println("Multiplication table of 24 is");
		for(i=1; i<=10; i++) {
			System.out.println(24+" X "+i+" = "+24*i);	
		}
		System.out.println();
	}
	public void t50() {
		
		System.out.println("Multiplication table of 50 is");
		for(i=1; i<=10; i++) {
			System.out.println(50+" X "+i+" = "+50*i);
		}
		System.out.println();
	}
	public void t29() {
	
		System.out.println("Multiplication table of 29 is");
		for(i=1; i<=10; i++) {
			System.out.println(29+" X "+i+" = "+29*i);
		}
		System.out.println();
	}

}

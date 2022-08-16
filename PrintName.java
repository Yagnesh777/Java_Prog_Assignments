import java.util.Scanner;
public class PrintName
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       name(); 
	}
	static void name()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your First Name");
		char name=0;
		name=sc.next().charAt(name);
		System.out.println("Enter Your Middle Name");
		char middleName=0;
		middleName=sc.next().charAt(middleName);
		System.out.println("Enter Your Surname Name");
		String surname;
		surname=sc.next();
		System.out.println("Your Name is "+name+"."+middleName+"."+surname+".");
		
	}

}
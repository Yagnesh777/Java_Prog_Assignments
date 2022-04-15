

import java.util.*;  
class assign2B 
{
	public static void main(String args[]) 
	{
		int l, b, area, per;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of rectangle: ");
		l = sc.nextInt();
		System.out.println("Enter breadth of rectangle: ");
		b = sc.nextInt();
		
		//Area
		area = l*b;    
		System.out.println("The Area of Rectangle is "+area);
		
		//Perimeter
		per = 2*(l+b);    
		System.out.println("The Perimeter of Rectangle is "+per);
	}
}
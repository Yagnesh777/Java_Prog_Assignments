import java.util.*;  
class profit_loss
{
	public static void main(String args[]) 
	{
		int sp, cp, res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Selling Price for an item: ");
		sp = sc.nextInt();
		System.out.println("Enter Cost Price of an item: ");
		cp = sc.nextInt();
		
		// Selling price must be greater than cost price
		res = sp-cp;    
		System.out.println("Profit for the item is "+res);
	}
}

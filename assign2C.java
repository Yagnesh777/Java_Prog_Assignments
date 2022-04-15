import java.util.*;  
class assign2C 
{
	public static void main(String args[]) 
	{
		int sp, cp, profit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Selling Price for an item: ");
		sp = sc.nextInt();
		System.out.println("Enter Cost Price of an item: ");
		cp = sc.nextInt();
		
		//Profit
		profit = sp-cp;    
		System.out.println("Profit for the item is "+profit);
	}
}
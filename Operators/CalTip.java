import java.util.Scanner;
class CalTip
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter subtotal : ");
		float sub = sc.nextFloat();
		System.out.print("Enter tip rate : ");
		float tipRate = sc.nextFloat();
		
		float tip = (sub*tipRate)/100;
		float total = tip + sub;
		
		System.out.println("The tip is " + tip + " and total is " + total);
	}
}

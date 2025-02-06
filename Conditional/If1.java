import java.util.Scanner;
class If1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your bill amount : ");
		int billAmt = sc.nextInt();
		double discount = 0;
		
		if(billAmt > 3000)
		{
			discount = billAmt*0.1;
			billAmt -= discount;
			System.out.println("Discount : " + discount);
			
		}
		System.out.println("Total bill amount : " + billAmt);
	}
}

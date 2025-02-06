import java.util.Scanner;
class If2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your bill amount : ");
		int billAmt = sc.nextInt();
		double dc = 0;
		
		if(billAmt < 500)
		{
			dc = billAmt*0.1;
			billAmt += dc;
			System.out.println("Delivery charge : " + dc);
			//System.out.println("Total bill amount ( " + billAmt + "+" + dc + ")" + billAmt);
			
			
		}
	    System.out.println("Total bill amount ( " + billAmt + " + " + dc + ") = " + billAmt);
	}
}

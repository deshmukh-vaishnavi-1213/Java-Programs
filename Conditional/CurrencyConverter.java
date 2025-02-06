import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("      CURRENCY CONVERTER ");
		System.out.println();
		
		System.out.print("Enter the amount(INR) : ");
		float inr = sc.nextFloat();
		System.out.println();
		
		System.out.println("#LIST OF CURRENCIES");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println("5. WON");
		System.out.println("6. YEN");
			
		System.out.print("Enter the currency : ");
		String curr = sc.next().toUpperCase();
		
		float conCurr = 0;
		
		if(curr.equals("USD"))
		{
			conCurr = inr/86.56F;
			System.out.println(inr + " INR = " + conCurr + " USD");
		}
		else if(curr.equals("EUR"))
		{
			conCurr = inr/90.25F;
			System.out.println(inr + " INR = " + conCurr + " EUR");
		}
		else if(curr.equals("GBP"))
		{
			conCurr = inr/107.6F;
			System.out.println(inr + " INR = " + conCurr + " GBP");
		}
		else if(curr.equals("PKR"))
		{
			conCurr = inr/0.3107F;
			System.out.println(inr + " INR = " + conCurr + " PKR");
		}
		else if(curr.equals("WON"))
		{
			conCurr = inr/0.0599F;
			System.out.println(inr + " INR = " + conCurr + " WON");
		}
		else if(curr.equals("YEN"))
		{
			conCurr = inr/0.5567F;
			System.out.println(inr + " INR = " + conCurr + " YEN");
		}
		else 
		{
			System.out.println("INVALID OPTION");
		}
	}
}

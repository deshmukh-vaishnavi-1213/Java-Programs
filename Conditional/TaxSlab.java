import java.util.Scanner;
class TaxSlab
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your salary per annum : ");
		double salary = sc.nextDouble();
		
		if(salary>=0 && salary<=1200000)
		{
			System.out.println("No Tax!");
		}
		else if(salary>1200000 && salary<=1600000)
		{
			System.out.println("Your chargeble tax is Rs. " + (salary*0.15));
		}
		else if(salary>1600000 && salary<=2000000)
		{
			System.out.println("Your chargeble tax is Rs. " + (salary*0.2));
		}
		else if(salary>2000000 && salary<=2400000)
		{
			System.out.println("Your chargeble tax is Rs. " + (salary*0.25));
		}
		else if(salary>2400000)
		{
			System.out.println("Your chargeble tax is Rs. " + (salary*0.3));
		}
	}
}
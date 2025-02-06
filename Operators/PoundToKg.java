import java.util.Scanner;
class PoundToKg
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number in pounds : ");
		float pound = sc.nextFloat();
		
		double kg = pound * 0.454;
		
		System.out.println(pound + " pounds is " + kg + " kilograms ");
	}
}

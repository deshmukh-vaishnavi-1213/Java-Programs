import java.util.Scanner;
class ConvertTemp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a degree in celsius : ");
		double celsius = sc.nextFloat();
		
		double Farh = (9.0/5)*celsius + 32;
		
		System.out.println(celsius + " Celsius is " + Farh + " Farhanheit");
	}
}

import java.util.Scanner;
class PrintHiNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		String res = (num%2 == 0 && num%5 == 0)?("HiTwoFive"):((num%2==0)?("HITwo"):((num%5==0)?("HiFive"):(" ")));
		System.out.println(res);
	}
}

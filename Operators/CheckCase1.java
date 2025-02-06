import java.util.Scanner;
class CheckCase2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch = sc.next().chatAt(0);
		
		String res = ((ch >= 'A' && ch <= 'Z')||ch >= 'a' && ch <= '122'))?
			((ch >= 'A' && ch <= 'Z')?(ch + " is uppercase"):(ch + " is lowercase")):
			((ch >= '0' && ch <= '9')?(ch + " is a digit"):(ch + " is a special character" ));
		System.out.println(res);
	}
}

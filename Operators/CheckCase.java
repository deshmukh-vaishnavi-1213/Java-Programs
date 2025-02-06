import java.util.Scanner;
class CheckCase 
{
	public static void main(String[] args) 
	{
		//char ch = 'a';
		//String res = (ch >= 'A' && ch <= 'Z')?("Character is uppercase"):("Character is lowercase");
		//System.out.println(res);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character : ");
		char ch = sc.next().chatAt(0);
		
		String res = (ch >= 'A' && ch <= 'Z')?("Character is uppercase"):("Character is lowercase");
		
		System.out.println(res);
	}
}

import java.util.Scanner;
class Switch1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an alphabet : ");
		char ch = sc.next().charAt(0);
		
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
		{
			switch(ch)
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				{
					System.out.println("It is an vowel");
					break;
				}
				default:
				{
					System.out.println("It is a consonant");
				}
			}
		}
		else
		{
			System.out.println("Not an alphabet");
		}
	}
}

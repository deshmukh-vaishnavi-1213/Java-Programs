import java.util.Scanner;
class VowelUN 
{
	public static void main(String[] args)throws InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter username : ");
		String un = sc.next();
		int len = un.length();
		
		System.out.print("Vowels from username : ");
		
		for (int i = 0; i<len ; i++ )
		{
			switch(un.charAt(i))
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
					System.out.print(un.charAt(i));
					break;
				}
			}
		}
	}
}

import java.util.Scanner;
class VowelUN2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter username : ");
		String un = sc.next();
		int len = un.length();
		
		String dup = un.toLowerCase();
		
		System.out.print("Vowels from username : ");
		
		for (int i = 0; i<len ; i++ )
		{
			char ch = dup.charAt(i);
			if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')
			{
				System.out.println(ch);
			}
		}
	}
}

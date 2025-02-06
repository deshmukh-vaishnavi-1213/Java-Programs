import java.util.Scanner;
class UserName 
{
	public static void main(String[] args)throws InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter username : ");
		String un = sc.next().toUpperCase();
		int len = un.length();
		
		for (int i = 0; i<len ; i++ )
		{
			System.out.print(un.charAt(i));
			Thread.sleep(140);
		}
	}
}

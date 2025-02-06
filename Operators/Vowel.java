import java.util.Scanner;
class Vowel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a aplhabet : ");
		char s = sc.next.chatAt(0);
		
		String ans = (s=='a'||s=='e'||s=='i'||s=='o'||s=='u')?(s + " is a vowel"):(s + " is a consonent ");
		System.out.println(ans);
	}
}

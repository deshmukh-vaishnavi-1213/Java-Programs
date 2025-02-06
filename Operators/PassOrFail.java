import java.util.Scanner;
class PassOrFail
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter your marks :");
		int marks = sc.nextInt();
		
		float per = marks/6;
		
		String res = (per>=35)?("Pass"):("Fail");
		System.out.println(per);
		System.out.println(res);
	}
}

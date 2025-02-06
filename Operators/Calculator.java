import java.util.Scanner;
class Calculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();
		System.out.print("Enter an operation : ");
		char op = sc.next().charAt(0);
		float opt = 0;
		
		opt = (op == '+')? num1+num2 :
			  (op == '-')? num1-num2 :
			  (op == '*')? num1*num2 :
			  (op == '/')? num1/num2 :
			  (op == '%')? num1%num2 :0.000001f;
		
		
		String output = num1+" "+op+" "+num2+" = "+opt;
		
		if(!(opt==0.000001f))
		{
			System.out.println(output);
		}
		
	}
}	

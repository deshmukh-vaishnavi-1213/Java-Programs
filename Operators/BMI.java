import java.util.Scanner;
class BMI 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds : ");
		float w = sc.nextFloat();
		System.out.print("Enter height in  : ");
		float h = sc.nextFloat();
		
		float new_w = w*0.45359237f;
		float new_h = h*0.0254f;
		
		float bmi = new_w/(new_h * new_h);
		
		System.out.println("BMI is " + bmi);
	 
	}
}

import java.util.Scanner;
class Circle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of circle(cm) : );
		float r = sc.nextFloat();
		
		final float pie = 22/7;
		float area = pie*r*r;
		
		System.out.println("Area of circle with radius "+ r + "is :" + area + " cm^2");
	}
}

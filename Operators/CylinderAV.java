import java.util.Scanner;
class CylinderAV 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius and height of a cylinder : ");
		double r = sc.nextFloat();
		double h = sc.nextFloat();
		
		final float pie = 22/7;
		
		double area = (2*pie*r*r) + (2*pie*r*h);
		double vol = area*h;
		
		System.out.println("Area of cylinder : " + area);
		System.out.println("Volume of cylinder : " + vol);
	}
}

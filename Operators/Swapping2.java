class Swapping2
{
	public static void main(String[] args) 
	{
		int a = 2;
		int b = 4;
		System.out.println("Before swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
}

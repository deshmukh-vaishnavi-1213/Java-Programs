class LargestNum 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 340;
		int c = 45;
		
		int lar = a>b ? ( a>c ? a : c ) : ( b>c ? b : c);
		System.out.println("Largest Number : " + lar);
	}
}

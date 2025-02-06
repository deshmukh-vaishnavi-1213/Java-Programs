class ForLoop 
{
	public static void main(String[] args) 
	{
		System.out.println("--------1 to 10--------");
		for(int i = 1; i<= 10; i++ )
		{
			System.out.println(i);
		}
		
		System.out.println("--------A to Z--------");
		for(char ch = 'A'; ch<= 'Z'; ch++ )
		{
			System.out.println(ch);
		}
		
		System.out.println("--------z to a--------");
		for(char ch = 'z'; ch>= 'a'; ch-- )
		{
			System.out.println(ch);
		}
		
		System.out.println("---------0 to 9 char--------");
		for(char ch = '0'; ch<= '9'; ch++ )
		{
			System.out.println(ch);
		}
		
		System.out.println("---------ASCII Table--------");
		for(int i = 0; i<= 127; i++ )
		{
			System.out.println(i + " : " + ((char)i));
		}
	}
}

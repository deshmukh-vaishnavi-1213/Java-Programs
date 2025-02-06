class Odd100to1
{
	public static void main(String[] args) 
	{
		System.out.println("---Odd numbers from 100 to 1---");
		for ( int i = 100; i>=1 ; i-- )
		{
			if(i%2!=0)
			{
				System.out.print(i + ", ");
			}
		}
	}
}

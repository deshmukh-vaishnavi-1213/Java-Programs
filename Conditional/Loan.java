class Loan
{
	public static void main(String[] args) 
	{
		int months = 20;
		int years = months/12;
		int remMon = months%12;
			
		System.out.println(years + remMon/10.0);
	}
}

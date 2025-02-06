import java.util.Scanner;
class Years
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of minutes : ");
		int min = sc.nextInt();
		
		int years = min / (365*24*60);   //1902 years
		int remMin = min % (365*24*60);  //308800 minutes
		int days = remMin / (24*60);     //214
		
		//System.out.println(years);
		//System.out.println(remMin);
		
		System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
	}
}

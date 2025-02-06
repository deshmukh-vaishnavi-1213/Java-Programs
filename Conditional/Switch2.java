import java.util.Scanner;
class Switch2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a month : ");
		String month = sc.next().toLowerCase();
		
		switch(month)
		{
			case "november":
			case "december":
			case "january":
			case "february":
			{
				System.out.println("Winter");
				break;
			}
			case "march":
			case "april":
			case "may":
			case "june":
			{
				System.out.println("Summer");
				break;
			}
			case "july":
			case "august":
			case "september":
			case "october":
			{
				System.out.println("Monsoon");
				break;
			}
			default:
			{
				System.out.println("Enter valid month");
			}
		}
	}
}

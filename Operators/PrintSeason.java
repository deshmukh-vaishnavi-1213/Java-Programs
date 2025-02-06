import java.util.Scanner;
class PrintSeason
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter month :");
		String month = sc.next().toUpperCase();
		
		String res = (month.equals("OCT")||month.equals("NOV")||month.equals("DEC")||month.equals("JAN"))?("Winter"):
			         ((month.equals("FEB")||month.equals("MAR")||month.equals("APR")||month.equals("MAY"))?("Summer"):
			((month.equals("JUN")||month.equals("JUL")||month.equals("AUG")||month.equals("SEP"))?("Monsoon"):("Invalid month")));
	
		System.out.println(res);
	}
}


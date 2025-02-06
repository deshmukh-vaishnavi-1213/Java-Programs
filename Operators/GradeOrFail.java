import java.util.Scanner;
class GradeOrFail
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter your marks :");
		int marks = sc.nextInt();
		
		float per = (marks*100)/600;
		
		String res = (per>=75)?"Grade A with "+ per + " %":
					 (per>=60)?"Grade B with "+ per + " %":
		           	 (per>=35)?"Grade C with "+ per + " %":"Fail";
		
		System.out.println(res);
	}
}

class EvenOddDig2
{
	public static void main(String[] args) 
	{
		int num = 8762;
		int evenPro = 1;
		int oddPro = 1;
		int temp = 0;
		
		int rem = num % 10;
		temp = (rem%2==0) ? (evenPro = evenPro * rem) : (oddPro = oddPro * rem);
		
		num = num / 10;
		rem = num % 10;
		temp = (rem%2==0) ? (evenPro = evenPro * rem) : (oddPro = oddPro * rem);
		
		num = num / 10;
		rem = num % 10;
		temp = (rem%2==0) ? (evenPro = evenPro * rem) : (oddPro = oddPro * rem);
		
		num = num / 10;
		rem = num % 10;
		temp = (rem%2==0) ? (evenPro = evenPro * rem) : (oddPro = oddPro * rem);
		
		System.out.println("Even product : " + evenPro);
		System.out.println("Odd product : " + oddPro);
	}
}


import java.util.Scanner;
class bitstrings
{
	public static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);
	   int s = sc.nextInt();
	   int base = 2;
	   double result  = Math.pow(base,s);
	 
	   System.out.println(result);
	}
}
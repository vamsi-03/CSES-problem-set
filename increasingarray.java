import java.util.Scanner;
class increasingarray
{
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		long x[] = new long[n];
		for(int i = 0;i<n;i++)
		{
			x[i] = sc.nextLong();
		}
		long ans = 0;
		for(int i = 1;i<n;i++)
		{
			if(x[i] < x[i-1])
			{
				ans+= x[i-1]-x[i];
				x[i] = x[i-1];
			}
		}
		System.out.println(ans);
	}
}
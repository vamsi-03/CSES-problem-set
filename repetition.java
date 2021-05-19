import java.util.Scanner;
import java.lang.Math;
class repetition
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
        int n = c.length;
		int s = 1;
		int max_s = 1;
		for(int i = 1;i<n;i++)
		{
			if(c[i] == c[i-1])
			{
				s++;
			}
			else
			{  
				s = 1;
			}
			max_s = Math.max(max_s,s);
		}
		System.out.print(max_s);
	}
}
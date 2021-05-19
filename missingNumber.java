import java.util.Scanner;
import java.util.Arrays;

class missingNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num-1];
		int total = num*(num+1)/2;
		long sum = 0;
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		long v = (long)num*(num+1)/2;
		System.out.print(v-sum);
	}
}
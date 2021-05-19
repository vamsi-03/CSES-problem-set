import java.util.Scanner;
class numberspiral
{
	Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
	   
	   int i,j,num;
	   int arr[i][j];
	   Scanner sc = new Scanner(System.in);
       numberspiral p = new numberspiral();
       System.out.println("Enter number of items in spiral:");
        num = sc.nextInt();
        for(i = 1;i<=num;i++)
        {
        	for(j = 1;j<=num;j++)
        	{
        		arr[i][j] = sc.nextInt();
        	}
        }
       System.out.println("enter no.of test cases:");
       int t = sc.nextInt();
       System.out.println("enter row number:");
       int row = sc.nextInt();
       System.out.println("enter column number:");
       int column = sc.nextInt();
       p.checknumber(arr,row,column,t);

	}
	void checknumber(int arr[][],int row,int column,int t)
	{
       while(t>=0)
       {
       	for(int i = 1;i<=5;i++)
       	{
       		for(int j = 1;j<=5;j++)
       		{
       			if(arr[i][j] == arr[row][column])
       			{
       				System.out.println(arr[i][j]);
       			}
       		}
       	}
       }
	}
}
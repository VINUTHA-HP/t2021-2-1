import java.util.Scanner;

public class Problem2 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner (System.in);
	System.out.println("entre the number");
	int a=scan.nextInt();
	if(a==1)
	{
		System.out.println("1");
	}
	else
	{
		System.out.print("1");
	}
	for(int i=3;i<2*a;i++)
	{
		if(i%2!=0)
		{
			System.out.print(" , "+i);
		}
	}
  }
}

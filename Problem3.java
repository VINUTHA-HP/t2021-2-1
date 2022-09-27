import java.util.Scanner;

public class Problem3 
{
  public static void main(String[] args) 
  {
	Scanner scan=new Scanner (System.in);
	System.out.println("entre the number");
	int a=scan.nextInt();
	if(a==1&&a==2)
	{
		System.out.println(" 1 ");
	}
	else
	{
		System.out.print(" 1 ");
 if (a%2==0)
	 a--;
	for (int j=3 ;j<=2*a; j++)
	{
		if(j%2!=0)
		{
			System.out.print(" , "+j);
		}
	}
  }
}
}

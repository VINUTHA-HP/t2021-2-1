import java.util.Scanner;

public class Problem4 
{
 public static void main(String[] args) 
 {
	  int count=0;
	  Scanner scan=new Scanner(System.in);
	  System.out.println("entre the number of elements in the array");
	  int a=scan.nextInt();
	  int arr[]=new int [a];
	  System.out.println("entre the array elements");
	  for (int i=0;i<a;i++)
	  {
		  arr[i]=scan.nextInt();	  
	  }
	  System.out.print(1+ ":" +a);
	  for (int i=2; i<=9;i++)
	  {
		  for (int j=0;j<a;j++)
		  {
			  if (arr[j]%i==0)
			  {
				  count++;
			  }
		  }
		  System.out.print(" , "+i+" : "+count );
		  count=0;
	  }	  
 }
}

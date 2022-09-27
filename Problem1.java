import java.util.Scanner;

public class Problem1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Entre the first number");
		double a=scan.nextDouble();
		System.out.println("Entre the second number");
		double b=scan.nextDouble();
		System.out.println("entre add for addition , entre the sub for substraction ,entre mul for multplication ,entre div for division");
        String choice=scan.next();
        switch(choice)
        {
        case "add" :System.out.println(a+b);
        break;
        case "sub" :System.out.println(a-b);
        break;
        case "mul" :System.out.println(a*b);
        break;
        case "div"  :System.out.println(a/b);
        break;
        default :System.out.println("entre the incorrect operation");
        }
	}

}

import java.util.*;
class SimleCal
{

	public static void main(String args[])
  {

	Scanner sc = new Scanner(System.in);
	int a,b,ch;
	System.out.println("Enter 1st No:");
	a = sc.nextInt();
	System.out.println("Enter 2nd No:");
	b = sc.nextInt();
	System.out.println("Enter Your Choice:\n 1->Addition\n 2->Subtraction\n 3->Multiplication\n 4->Division\n");
	ch = sc.nextInt();
	if(ch==1)
	{
		System.out.println("Addition="+(a+b));
	}
	else if(ch==2)
	{
		System.out.println("Substraction="+(a-b));
	}
	else if(ch==3)
	{
		System.out.println("Multiplication="+(a*b));
	}
	else if(ch==4)
	{
		System.out.println("Division="+(a/b));
	}
	else
	{
		System.out.println("Invalid Choice");
	}

  }

}
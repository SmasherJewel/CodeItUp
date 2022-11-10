import java.util.*;
class MaxNo
{

	public static void main(String args[])
{

	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter 1st No:");
	a = sc.nextInt();
	System.out.println("Enter 2nd No:");
	b = sc.nextInt();
	System.out.println("Enter 3rd No:");
	c = sc.nextInt();

	if(a>b &&  a>c)
	{

	System.out.println("Max No="+a);

	}

	else if(b>a && b>c)
	{

	System.out.println("Max No="+b);

	}

	else
	{

	System.out.println("Max No="+c);

         }

	}

}
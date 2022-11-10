import java.util.*;
class NoCheck
{

	public static void main(String args[])
  {
	Scanner sc = new Scanner(System.in);
	int no;
	System.out.println("Enter a No:");
	no = sc.nextInt();
	if(no>0)
	{
		System.out.println("Possative No");
	}
	else if(no<0)
	{
		System.out.println("Negative No");
	}

	else
	{
		System.out.println("Zero");
	}
  }

}
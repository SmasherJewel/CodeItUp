import java.util.*;
class PrintNo
{

	public static void main(String args[])
  {

	Scanner sc = new Scanner(System.in);
	int no,i;
	System.out.println("Enter Max Number to Print:");
	no = sc.nextInt();
	for(i=1;i<=no;i++)
	{
		System.out.println(i);
	}

  }

}
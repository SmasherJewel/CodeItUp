import java.util.*;
class PrintNoWhile
{

	public static void main(String args[])
  {

	Scanner sc = new Scanner(System.in);
	int no,i=1;
	System.out.println("Enter Max Number to Print:");
	no = sc.nextInt();
	while(i<=no)
	{
		System.out.println(i);
		i++;
	}
	
  }

}
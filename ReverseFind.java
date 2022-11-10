import java.util.*;
class ReverseFind
{

	public static void main(String args[])
  {

	Scanner sc = new Scanner(System.in);
	int no,rev=0;
	System.out.println("Enter Number to Find Reverse:");
	no = sc.nextInt();
	while(no>0)
	{
		rev = (rev*10)+no%10;
		no = no/10;
	}
		System.out.println("Reverse Number="+rev);
  }

}
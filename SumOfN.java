import java.util.*;
class SumOfN
{

	public static void main(String args[])
  {

	Scanner sc = new Scanner(System.in);
	int no,sum=0;
	System.out.println("Enter No to Find Sum of N Natural Numbers:");
	no = sc.nextInt();
	for(int i=1;i<=no;i++)
	{
		sum += i;
	} 
		System.out.println("Sum of N Natural Number="+sum);

  }

}
import java.util.*;
class SumOfDigit
{

	public static void main(String args[])
{

	Scanner sc = new Scanner(System.in);
	int no,sum=0;
	System.out.println("Enter No to Find Sum of Digit:");
	no = sc.nextInt();
	while(no>0)
	{
		sum += no%10;
		no = no/10; 
	}
		System.out.println("Sum of Digit="+sum);

}

}
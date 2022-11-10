import java.util.*;
class ProductOfDigit
{

	public static void main(String args[])
{

	Scanner sc = new Scanner(System.in);
	int no,pro=1;
	System.out.println("Enter Number to Find Product of a Digit:");
	no = sc.nextInt();
	while(no>0)
	{
		pro = pro * (no%10);
		no = no/10;
	}
		System.out.println("Product of Digit="+pro);

}

}
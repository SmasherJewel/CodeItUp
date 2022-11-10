import java.util.*;
class SumOfEvenProOfOdd
{

	public static void main(String args[])
  {

	Scanner sc = new Scanner(System.in);
	int no,sum=0,pro=1,digit;
	System.out.println("Enter No to Find Sum of Even and Product of Odd No:");
	no = sc.nextInt();
	while(no>0)
	{
		digit = no%10;
		if(digit%2==0){
			sum += digit;
		}
		else{
			pro *= digit;
		}
			no = no/10;
	}
		System.out.println("Sum of Even="+sum);
		System.out.println("Product of Digit="+pro);
	

  }

}
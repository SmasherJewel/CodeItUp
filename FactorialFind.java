import java.util.*;
class FactorialFind
{

	public static void main(String args[])
  {

	Scanner sc = new Scanner(System.in);
	int no,fac=1;
	System.out.println("Enter No to Find Factorial:");
	no = sc.nextInt();
	for(int i=no;i>=1;i--){
		fac *= i;	
	}
		System.out.println("Factorial="+fac);

  }

}
import java.util.*;
class PalindromNo
{

	public static void main(String args[])
  {

	Scanner sc = new Scanner(System.in);
	int no,rev=0,palin;
	System.out.println("Enter No to Check is Palnidrom or not:");
	no = sc.nextInt();
	palin = no;
	while(no>0)
	{
		rev = rev*10+(no%10);
		no = no/10;
	}
	if(rev==palin){
		System.out.println("Palindrom No");
	}	
	else{
		System.out.println("Not Palindrom No");
}

  }

}
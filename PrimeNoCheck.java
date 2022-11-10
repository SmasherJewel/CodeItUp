import java.util.*;
class PrimeNoCheck
{

	public static void main(String args[])
  {

	Scanner sc = new Scanner(System.in);
	int no,count=0;
	System.out.println("Enter No to Check is Prime or Not:");
	no = sc.nextInt();
	for(int i=1;i<=no;i++){
		if(no%i==0){
			count++;
		}
	}
	if(count==2){
		System.out.println("Prime No");
	}
	else{
		System.out.println("Not Prime No");
	}

  }

}
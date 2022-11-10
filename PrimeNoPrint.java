import java.util.*;
class PrimeNoPrint
{

	public static void main(String args[])
  {

	Scanner sc = new Scanner(System.in);
	int no,count,total=0;
	System.out.println("Enter No to Print Prime Numbers:");
	no = sc.nextInt();
	for(int i=1;i<=no;i++){
		count=0;
		for(int j=1;j<=i;j++){
			if(i%j==0){
				count++;
			}
			
		}

		if(count==2){
				System.out.println(i);
				total++;
			}
	}

		System.out.println("Total Prime No="+total);
	}
  }

import java.util.*;
class MultipleTablePrint{

    public static void main(String args[]){


	Scanner sc = new Scanner(System.in);
	int no;
	System.out.println("Enter No to Print Table:");
	no = sc.nextInt();
	
	for(int i=1;i<=10;i++){
		System.out.println(no + "*" + i + "=" + (no*i));
	}

   }

}
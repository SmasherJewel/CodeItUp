import java.util.*;
class FibonaciMaxValue{

    public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	int x=0,y=1,z=0,no;
	System.out.println("Enter Value to Print Fibonaci Series:");
	no = sc.nextInt();
	
	while(z<=no){
		System.out.println(z);
		x=y;
		y=z;
		z=x+y;
	}

  }


}
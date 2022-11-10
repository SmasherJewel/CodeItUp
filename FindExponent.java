import java.util.*;
class FindExponent{

     public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	int base,power,pro=1;
	System.out.println("Enter Base:");
	base = sc.nextInt();
	System.out.println("Enter Power:");
	power = sc.nextInt();

	while(power>=1){
		pro *= base;
		power--;
	}
		System.out.println("Value="+pro);

  }

}
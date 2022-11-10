import java.util.*;
class BreakDemo{

       public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	int i=0;
	while(i<=10){
		i++;
		if(i==5)
		break;
		System.out.println(i);
	}
		System.out.println("Loop Terminated");

  }

}
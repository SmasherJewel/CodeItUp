import java.util.*;
class ContinueDemo{

       public static void main(String args[]){

	Scanner sc = new Scanner(System.in);
	int i=0;
	while(i<=10){
		i++;
		if(i==5)
		continue;
		System.out.println(i);
	}
		System.out.println("Loop Terminated");

  }

}
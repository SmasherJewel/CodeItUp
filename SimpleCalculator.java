import java.util.*;
class SimpleCalculator
{

	public static void main(String args[])
  {

	Scanner sc = new Scanner(System.in);
	int a,b,ch;
	System.out.println("Enter First Number:");
	a = sc.nextInt();
	System.out.println("Enter Second Number:");
	b = sc.nextInt();
	System.out.println("Enter Your Choice:\n 1->Addition\n 2->Subtraction\n 3->Multiplication\n 4->Division\n Your Choice:\n");
	ch = sc.nextInt();
	switch(ch)
	{

		case 1:
			System.out.println("Addition="+(a+b));
			break;
		case 2:
			System.out.println("Substraction="+(a-b));
			break;
		case 3:
			System.out.println("Multiplication="+(a*b));
			break;
		case 4:
			System.out.println("Division="+(a/b));
			break;
		default:
			System.out.println("Invalid Choice");



	}

   }

}
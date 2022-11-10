import java.util.*;
class Rectangle
{

	public static void main(String args[])
  {

	Scanner sc = new Scanner(System.in);
	int len,bre,area,pera;
	System.out.println("Enter Length:");
	len = sc.nextInt();
	System.out.println("Enter Bridth:");
	bre = sc.nextInt();
	area = len*bre;
	pera = 2*(len+bre);
	System.out.println("Area of a Rectagle="+area);
	System.out.println("Perimeter of a Rectangle="+pera);	
	
  }

} 
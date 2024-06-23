
import java.util.Scanner;

public class SwapingTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1: ");
		num1=sc.nextInt();
		System.out.println("Enter num2: ");
		num2=sc.nextInt();
		System.out.println("num1 and num2 before Swapping: "+num1+" "+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("num1 and num2 after Swapping: "+num1+" "+num2);
		

	}

}

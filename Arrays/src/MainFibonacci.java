import java.util.Scanner;

public class MainFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		Fibonacci fib=new Fibonacci();
		fib.arrayFibonacci(n);

	}

}

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rem=0;
		boolean isOdd=true;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0) {
			rem=n%10;
			if(rem%2==0) {
				isOdd=false;
				break;
			}
			n=n/10;
		}
		System.out.println(isOdd);

	}

}

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=n;i>n/2;i--) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n/2;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				}
				System.out.println();
			}
		}

	}



import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		switch(n) {
		case 0:
			System.out.println("ICE");
			break;
		case 100:
			System.out.println("STEAM");
			break;
		}
		if(n>0 && n<100) {
			System.out.println("WATER");
		}
		

	}

}

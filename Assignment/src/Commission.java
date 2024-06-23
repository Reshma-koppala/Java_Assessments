import java.util.Scanner;

public class Commission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Amount;
		float commision = 0;
		Scanner sc=new Scanner(System.in);
		Amount=sc.nextInt();
		if(Amount<10000) {
			commision=500;
		}
		else if(Amount>10001 && Amount<12000) {
			commision=500+(Amount-10000)*10/100;
		}
		else if(Amount>12001 && Amount<15000) {
			commision=500+2000*10/100+(Amount-12000)*15/100;
		}
		else {
			commision=500+2000*10/100+3000*15/100+(Amount-15000)*20/100;
		}
		System.out.println("Commission: "+commision);

	}

}

import java.util.Scanner;
public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sum=sum+a[0]+a[n-1]+a[n/2]+a[(n/2)-1]+a[(n/2)+1]+a[(n/2)+2];
		System.out.println("sum:"+sum);

	}

}

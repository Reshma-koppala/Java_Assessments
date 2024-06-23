import java.util.Scanner;
public class AvrageOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,length=0;
		float result;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			if(j%2==0) {
				sum=sum+a[j];
				length++;
			}
		}
		result=sum/length;
		System.out.println(result);
		

	}

}

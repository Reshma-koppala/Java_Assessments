import java.util.Scanner;
public class FoundArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		boolean isFound=false;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]==1 && a[i+1]==2 && a[i+2]==3) {
				isFound=true;
				break;
			}
		}
		System.out.println(isFound);
		}

	}



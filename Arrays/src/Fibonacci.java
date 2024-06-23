
public class Fibonacci {
	public void arrayFibonacci(int n) {
		int x=0,y=1,z;
		int a[]=new int[n];
		a[0]=x;
		a[1]=y;
		int count=2;
		while(count<n) {
			z=x+y;
			a[count]=z;
			x=y;
			y=z;
			count++;
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}

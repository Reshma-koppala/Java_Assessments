
public class EvenOdd {
	public void getDetails(int a[],int n) {
	int	sum=0;
	if(a[1]%2!=0) {
		for(int j=0;j<n;j++) {
			if(j%2==0)
				sum=sum+a[j];
		}
	}
	else
		for(int k=0;k<n;k++) {
			if(k%2!=0)
				sum=sum+a[k];
		}
	System.out.println("Sum:"+sum);

	
}
}

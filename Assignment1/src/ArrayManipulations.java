import java.util.Scanner;

public class ArrayManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int array[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:");
		n=sc.nextInt();
		System.out.println("Enter array elements:");
		for(int index=0;index<10;index++) {
			array[index]=sc.nextInt();
		}
		System.out.println("Array elements:");
		for(int index=0;index<10;index++) {
			System.out.print(array[index]+" ");
		}
		System.out.println();
		for(int index=0;index<10;index++) {
			if(array[index]%n==0) {
				System.out.print("Yes"+" ");
			}
			else {
				System.out.print("No"+" ");
			}
		}

	}

}

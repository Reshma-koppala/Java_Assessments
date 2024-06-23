import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		boolean isPalindrome=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		str=sc.next();
		int i=0,j=str.length()-1;
		str=str.toLowerCase();
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
				j--;
				continue;
			}
			else {
				isPalindrome=false;
				break;
			}
		}
		System.out.println("Given string is palindrome or not: "+isPalindrome);

	}

}

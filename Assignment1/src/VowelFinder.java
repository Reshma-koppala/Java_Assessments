import java.util.Scanner;

public class VowelFinder {
	String str;
	int count=0;
	public void readString() {
		Scanner sc=new Scanner(System.in);
		str=sc.next();
	}
	public void vowelCount() {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				count++;
		}
	}
	public void displayCount() {
		System.out.println("count of vowels="+count);
	}
	public static void main(String[] args) {
		VowelFinder vf=new VowelFinder();
		vf.readString();
		vf.vowelCount();
		vf.displayCount();
	}

}

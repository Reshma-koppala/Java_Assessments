
public class OddEvenArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Original[]= {10,20,30,40,50,60,70,80,90,100};
		int Odd[]=new int[10];
		int Even[]=new int[10];
		for(int index=0;index<Original.length;index++) {
			if(Original[index]%2==0) {
				Even[index]=Original[index];
				Odd[index]=0;
			}else {
				Odd[index]=Original[index];
				Even[index]=0;
			}
		}
		System.out.println("Original array elements:");
		for(int index=0;index<Original.length;index++) {
			System.out.print(Original[index]+" ");
		}
		System.out.println();
		System.out.println("Odd array elements:");
		for(int index=0;index<Odd.length;index++) {
			System.out.print(Odd[index]+" ");
		}
		System.out.println();
		System.out.println("Even array elements:");
		for(int index=0;index<Even.length;index++) {
			System.out.print(Even[index]+" ");
		}


	}

}


public class MaxLengthCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[]= {"Ongole","Guntur","Tirupati","Visakhapatnam","Nellore"};
		String city="Ongole";
		int max=array[0].length();
		for(int index=1;index<array.length;index++) {
			if(array[index].length()>max) {
				max=array[index].length();
				city=array[index];
			}
		}
		System.out.println("city with maximum no.of characters: "+city);
	}

}

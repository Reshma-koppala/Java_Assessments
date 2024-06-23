
public class MainCustomerDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDetails kiran=new CustomerDetails(101,"kiran",1500.00f);
		CustomerDetails neha=new CustomerDetails(102,"Neha",2000.00f);
		CustomerDetails nisha=new CustomerDetails(103,"Nisha",1700.00f);
		System.out.println("CustomerId: "+kiran.getId());
		System.out.println("CustomerName: "+kiran.getName());
		System.out.println("CustomerOrderamount "+kiran.getOrderAmount());
		System.out.println("CustomerId: "+neha.getId());
		System.out.println("CustomerName: "+neha.getName());
		System.out.println("CustomerOrderamount "+neha.getOrderAmount());
		System.out.println("CustomerId: "+nisha.getId());
		System.out.println("CustomerName: "+nisha.getName());
		System.out.println("CustomerOrderamount "+nisha.getOrderAmount());

	}

}

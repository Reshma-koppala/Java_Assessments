
public class Manager extends Employee{

	public Manager(long id, String name, String address, long phone, double sal) {
		super(id, name, address, phone, sal);
		// TODO Auto-generated constructor stub
	}
	public void computeTransportAllowance() {
		transportAllowance=basicSalary*15/100;
		System.out.println(transportAllowance);
	}


}

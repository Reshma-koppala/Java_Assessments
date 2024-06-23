
public class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double Hra=1000.50;
	double salary;
	double transportAllowance;
	public Employee(long id,String name,String address,long phone,double sal) {
		employeeId=id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
		basicSalary=sal;
	}
	public void calculateSalary() {
		salary=basicSalary+(basicSalary * specialAllowance/100)+(basicSalary*Hra/100);
		System.out.println(salary);
		
	}
	public void computeTransportAllowance() {
		transportAllowance=basicSalary*10/100;
		System.out.println(transportAllowance);
	}

}

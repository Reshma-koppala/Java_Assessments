
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mn=new Manager(126543,"peter","chennai",237899,65000);
		Trainee tr=new Trainee(29843,"jack","mumbai",442085,45000);
		mn.calculateSalary();
		tr.calculateSalary();
		mn.computeTransportAllowance();
		tr.computeTransportAllowance();

	}

}

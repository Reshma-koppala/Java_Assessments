
public class CustomerDetails {
	int id;
	String name;
	float orderAmount;
	public CustomerDetails(int id, String name, float orderAmount) {
		super();
		this.id = id;
		this.name = name;
		this.orderAmount = orderAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}

}

package Assignment3_4;

public class Contact {
	private String name, phone;

	@Override
	public String toString() {
		return  name + phone;
	}

	public Contact() {
		super();
	}

	public Contact(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}

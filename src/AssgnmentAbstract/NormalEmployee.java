package AssgnmentAbstract;

class NormalEmployee extends Employee {

	public NormalEmployee(String name, String address, int basicSalary) {
		super(name, address, basicSalary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMonthlySalary() {
		// TODO Auto-generated method stub
		return basicSalary;
	}

}

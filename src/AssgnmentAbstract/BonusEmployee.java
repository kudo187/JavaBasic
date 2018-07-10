package AssgnmentAbstract;

public class BonusEmployee extends Employee{
	public BonusEmployee(String name, String address, int basicSalary, int bonusSalary) {
		super(name, address, basicSalary);
		// TODO Auto-generated constructor stub
		this.bonusSalary = bonusSalary;
	}
	int bonusSalary;
	@Override
	public int getMonthlySalary() {
		// TODO Auto-generated method stub
		return basicSalary + bonusSalary;
	}

}

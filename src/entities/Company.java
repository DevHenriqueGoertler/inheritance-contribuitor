package entities;

public class Company extends Contribuitor {

	private Integer employees;

	public Company() {
		super();
	}

	public Company(String name, double anualIncome, Integer employees) {
		super(name, anualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public Double tax() {
		double result = 0;
		if (employees < 10) {
			result = getAnualIncome() * 0.16;
		} else {
			result = getAnualIncome() * 0.14;
		}
		return result;

	}

}

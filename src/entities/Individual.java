package entities;

public class Individual extends Contribuitor {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		double result = 0;
		if (getAnualIncome() < 20000.00) {
			if (healthExpenditures > 0) {
				result = getAnualIncome() * 0.15 - healthExpenditures / 2;
			} else {
				result = getAnualIncome() * 0.15;
			}
		} else {
			if (healthExpenditures > 0) {
				result = getAnualIncome() * 0.25 - healthExpenditures / 2;
			} else {
				result = getAnualIncome() * 0.25;
			}
		}
		return result;
	}

}

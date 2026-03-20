package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}	
	
	public Individual(String name, Double anuallncome, Double healthExpenditures) {
		super(name, anuallncome);
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
		if(anuallncome < 20000.00 && healthExpenditures > 0) {
			return ((anuallncome * 0.15) - (healthExpenditures * 0.5));
		}
		if(anuallncome > 20000.00 && healthExpenditures > 0) {
			return ((anuallncome * 0.25) - (healthExpenditures * 0.5));
		}
		return null;
	}

	@Override
	public String toString() {
		return "name" + getName() +"Individual [healthExpenditures=" + healthExpenditures + ", anuallncome=" + anuallncome + ", tax()="
				+ String.format("%.2f", tax()) + "]";
	}
}

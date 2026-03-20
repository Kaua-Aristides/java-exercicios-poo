package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmpoyee;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anuallncome, Integer numberOfEmpoyee) {
		super(name, anuallncome);
		this.numberOfEmpoyee = numberOfEmpoyee;
	}
	
	public Integer getNumberOfEmpoyee() {
		return numberOfEmpoyee;
	}

	public void setNumberOfEmpoyee(Integer numberOfEmpoyee) {
		this.numberOfEmpoyee = numberOfEmpoyee;
	}

	@Override
	public Double tax() {
		if(numberOfEmpoyee < 10) {
			return anuallncome * 0.16;
		}
		if(numberOfEmpoyee > 10) {
			return anuallncome * 0.14;
		}
		return null;
	}

	@Override
	public String toString() {
		return "Company [numberOfEmpoyee=" + numberOfEmpoyee + ", anuallncome=" + anuallncome + ", tax()=" + String.format("%.2f", tax())
				+ ", getName()=" + getName() + "]";
	}

}

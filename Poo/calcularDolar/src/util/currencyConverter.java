package util;

public class currencyConverter {
	
	public double dolarValues, dolarQuant;
	
	double iofCalcu() {
		return (dolarQuant * dolarValues) *  0.06;
	}
	public double result() {
		return (dolarQuant * dolarValues) +  iofCalcu();
	}
}

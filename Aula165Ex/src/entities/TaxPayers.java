package entities;

public abstract class TaxPayers {
	
	private String name;
	private Double anualIncome;
	
	public TaxPayers(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public abstract Double tax();
	
	public String toString() {
		return getName()
			   + ": $ "
			   + String.format("%.2f", tax());
	}
	
}

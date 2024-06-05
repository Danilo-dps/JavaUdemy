package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dollarReal(double valorDollar, double qtdeDollar) {
		return valorDollar * qtdeDollar * (1.0 + IOF);
	}
}

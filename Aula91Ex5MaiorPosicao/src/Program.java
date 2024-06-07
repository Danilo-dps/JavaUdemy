import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		int posMaior = 0;
		
		
		double[] vect = new double[n];
		double maior = vect[0];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i]= sc.nextDouble();
		}
		for(int i=0; i<vect.length; i++) {
			if(vect[i]>maior) {
				maior = vect[i];
				posMaior = i;
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.1f", maior);
		System.out.printf("\nPOSIÇÃO DO MAIOR VALOR = %d", posMaior);
		sc.close();
	}
}
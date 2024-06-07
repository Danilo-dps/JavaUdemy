import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vetores = new int[n];
		int sumPares = 0;
		int countPares = 0;
		
		for(int i=0; i<vetores.length; i++) {
			System.out.print("Digite um número: ");
			vetores[i] = sc.nextInt();
			if(vetores[i] % 2 == 0) {
				sumPares += vetores[i];
				countPares++;
			}
		}
		
		double mediaPares = (double)sumPares/countPares;
		if(sumPares > 0) {
			System.out.printf("MÉDIA DOS PARES = %.1f", mediaPares);
		}
		else {
			System.out.println("NENHUM NÚMERO PAR");
		}
		
		
		sc.close();
	}
}

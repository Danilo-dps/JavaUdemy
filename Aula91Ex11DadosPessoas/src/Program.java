import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		String[] genero = new String[n];
		double menor = altura[0];
		double maior = altura[0];
		double somaf = 0.0;
		double f = 0.0;
		int homem = 0;
		
		for(int i = 0; i < n; i++) {
		    System.out.printf("Altura da %dª pessoa: ", i+1);
		    altura[i] = sc.nextDouble();
		    System.out.printf("Genero da %dª pessoa: ", i+1);
		    sc.nextLine();
		    genero[i] = sc.nextLine();
		    if(genero[i].equalsIgnoreCase("f") || genero[i].equalsIgnoreCase("F")) {
		        somaf+= altura[i];
		        f++;
		    }
		    else if (genero[i].equalsIgnoreCase("m")|| genero[i].equalsIgnoreCase("M") ){
		        homem++;
		    }
		    if(i == 0) {
		        maior = altura[i];
		        menor = altura[i];
		    }
		    else {
		        if(altura[i] > maior) {
		            maior = altura[i];
		        }
		        if(altura[i] < menor) {
		            menor = altura[i];
		        }
		    }
		}

		
		double avg = somaf / f;
		
		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		System.out.printf("Média das alturas das mulheres = %.2f%n", avg);
		System.out.printf("Número de homens = %d%n", homem);
		
		sc.close();

	}
}

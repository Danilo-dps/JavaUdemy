import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		int maisVelho = idade[0];
		String nome1 = "s";
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Dados da %dª pessoa: %n", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(idade[i] > maisVelho) {
				maisVelho = idade[i];
				nome1 = nome[i];
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s", nome1);
		
		sc.close();
	}
}

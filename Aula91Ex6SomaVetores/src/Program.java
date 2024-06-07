import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];
	
		
		System.out.print("Digite os valores do vetor A: \n");
		for(int i=0; i<vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		System.out.print("Digite os valores do vetor B: \n");
		for(int i=0; i<vectA.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		System.out.print("VETOR RESULTANTE: \n");
		for(int i=0; i<n; i++) {
			System.out.printf("%d\n", vectC[i] = vectA[i] + vectB[i]);
		}
		
		sc.close();

	}
}

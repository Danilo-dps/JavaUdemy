package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	
	public static void main(String[] args) {
	
		String path = "C:\\temp\\in.txt";
		/*Usando o try-with-resources para facilitar o tratamento e encerramento
		 sem precisar declarar as variaveis e usar o finally
		 try (BufferedReader br = new BufferedReader(new FileReader(path))) a declaração
		 ocorre junto ao try
		*/
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());		 
		}
	}
}
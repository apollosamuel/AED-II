package lista0;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double numero = input.nextDouble();

		double absoluto = Math.abs(numero);
		System.out.println("N�mero absoluto: " + absoluto);
		
		input.close();
	}

}

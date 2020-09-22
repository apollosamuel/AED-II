package lista0;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Digite a temperatura: ");
		double temperatura = input.nextDouble();
		System.out.println("É Celsius? true or false");
		boolean isCelsius = input.nextBoolean();
		
		if(isCelsius) {
			double fahrenheit = (temperatura*(9.0/5.0)) + 32;
			System.out.println("Celsius > Fahrenheit: " + fahrenheit);
			
		}else {
			double celsius = (temperatura - 32) * (5.0 / 9.0);
			System.out.println("Fahrenheit > Celsius: " + celsius);
		}
		
		input.close();
	}

}

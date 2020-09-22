import java.util.Scanner;


//THROWS = ABORTA O PROBLEMA 
public class lista0 {

	static Scanner input = new Scanner(System.in);
	static double absoluto; 

	public static void main(String[] args) throws Exception {

		try {
			
			// Questao 01
			System.out.println("Digite um número: ");
			double numero = input.nextDouble();
			questao01(numero);
			
			// Questao 02
			System.out.println("Digite a temperatura: ");
			double temperatura = input.nextDouble();
			questao02(temperatura, true);
			System.out.println("Digite a temperatura: ");
			temperatura = input.nextDouble();
			questao02(temperatura, false);		
			
			System.out.println("Digite a temperatura: ");
			temperatura = input.nextDouble();
			System.out.println("É Celsius? true or false");
			boolean ehCelsius = input.nextBoolean();
			questao02(temperatura, ehCelsius);

			
		//Treatment Exception w/ Catch	
		}catch(Exception e) { 
			System.out.println("Digite um número válido!");
		}

	}

	public static void questao01(double numero) {
		absoluto = Math.abs(numero);
		System.out.println("Número absoluto: " + absoluto);
	}	
	
	public static void questao02(double temperatura, boolean isCelsius) {
		if(isCelsius) {
			double fahrenheit = (temperatura*(9.0/5.0)) + 32;
			System.out.println("Celsius > Fahrenheit: " + fahrenheit);
			
		}else {
			double celsius = (temperatura - 32) * (5.0 / 9.0);
			System.out.println("Fahrenheit > Celsius: " + celsius);
		}
	}


}

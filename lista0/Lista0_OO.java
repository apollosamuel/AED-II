package lista0;
import java.util.Scanner;


//THROWS = ABORTA O PROBLEMA 

public class Lista0_OO {
	

	static Scanner input = new Scanner(System.in);
	static double absoluto; 

	public static void main(String[] args) throws Exception {

		try {
			
			// Questao 01
			System.out.println("Digite um n�mero: ");
			double numero = input.nextDouble();
			ValorAbsoluto(numero);
			
			// Questao 02
			System.out.println("Digite a temperatura: ");
			double temperatura = input.nextDouble();
			CelsiusFahrenheit(temperatura, true);
			System.out.println("Digite a temperatura: ");
			temperatura = input.nextDouble();
			CelsiusFahrenheit(temperatura, false);		
			
			System.out.println("Digite a temperatura: ");
			temperatura = input.nextDouble();
			System.out.println("� Celsius? true or false");
			boolean ehCelsius = input.nextBoolean();
			CelsiusFahrenheit(temperatura, ehCelsius);

			
		//Treatment Exception w/ Catch	
		}catch(Exception e) { 
			System.out.println("Digite um n�mero v�lido!");
		}

	}

	public static void ValorAbsoluto(double numero) {
		absoluto = Math.abs(numero);
		System.out.println("N�mero absoluto: " + absoluto);
	}	
	
	public static void CelsiusFahrenheit(double temperatura, boolean isCelsius) {
		if(isCelsius) {
			double fahrenheit = (temperatura*(9.0/5.0)) + 32;
			System.out.println("Celsius > Fahrenheit: " + fahrenheit);
			
		}else {
			double celsius = (temperatura - 32) * (5.0 / 9.0);
			System.out.println("Fahrenheit > Celsius: " + celsius);
		}
	}

	
	public static void ImperialMks() {
		
		System.out.println("Digite o valor em milhas: ");
		double milhas = input.nextDouble();
		System.out.println("Digite o valor em jardas: ");
		double jardas = input.nextDouble();
		System.out.println("Digite o valor em pes: ");
		double pes = input.nextDouble();
		System.out.println("Digite o valor em polegadas: ");
		double polegadas = input.nextDouble();
		
		
		double milhasMetros = milhas*1609.34;
		double jardasMetros = jardas/1.094;
		double pesMetros = pes/3.281;
		double polegadasMetros = polegadas/39.37;
		
		System.out.println("Milhas em metros � = " + milhasMetros + " metros.");
		System.out.println("Jardas em metros � = " + jardasMetros + " metros.");
		System.out.println("P�s em metros � = " + pesMetros + " metros.");
		System.out.println("Polegadas em metros � = " + polegadasMetros + " metros.");
		
		
	}
	
	public static void Lacos(int n) {
		
		int numeroAux = n;
		
		System.out.println("For");
		for(int i = 0; i < n; i++) {
			System.out.println("*");
		}
		
		System.out.println("");
		
		System.out.println("While");
		n = numeroAux;
		while(n > 0) {
			System.out.println("*");
			n--;
		}
		
		System.out.println("");
		
		System.out.println("Do/While");
		n = numeroAux;
		do {
			System.out.println("*");
			n--;
		}while (n > 0);
		
	}
	
	
	public static void QuadradoPerfeito(int n) {

		int raiz = ((int) Math.sqrt(n));
	
		if(Math.pow(raiz, 2) == n) {
			System.out.println("Quadro perfeito");
		}else {
			System.out.println("N�o � um quadrado perfeito");
		}
		
	}
	
	
	public static void LogicaBooleana(boolean a, boolean b, char op) {
		
		boolean resultado = true;
		
		//Executa a l�gica booleana
		
		if (op == 'A' || op == 'a'){ //AND
			
			resultado = (a & b);
			
		}else if(op == 'O' || op == 'o') { // OR
			
			resultado = (a | b);
			
		}else if(op == 'X' || op == 'x') { //XOR
			
			resultado = (a ^ b);
			
		}else if(op == 'N' || op == 'n') { //NAND
			
			resultado = !(a & b);
			
		}else {
			System.out.println("Operador inv�lido!");
		}
		
		
		System.out.println(a + " " + op + " " + b + " " + " : " + resultado);
	}
	

}

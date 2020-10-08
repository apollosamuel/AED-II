package lista0;
import java.util.Scanner;


//THROWS = ABORTA O PROBLEMA 

public class Lista0_OO {
	

	static Scanner input = new Scanner(System.in);
	static double absoluto; 

	public static void main(String[] args) throws Exception {

		try {
			
			// Questao 01
			System.out.println("Digite um número: ");
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
			System.out.println("É Celsius? true or false");
			boolean ehCelsius = input.nextBoolean();
			CelsiusFahrenheit(temperatura, ehCelsius);

			
		//Treatment Exception w/ Catch	
		}catch(Exception e) { 
			System.out.println("Digite um número válido!");
		}

	}

	public static void ValorAbsoluto(double numero) {
		absoluto = Math.abs(numero);
		System.out.println("Número absoluto: " + absoluto);
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
		
		System.out.println("Milhas em metros é = " + milhasMetros + " metros.");
		System.out.println("Jardas em metros é = " + jardasMetros + " metros.");
		System.out.println("Pés em metros é = " + pesMetros + " metros.");
		System.out.println("Polegadas em metros é = " + polegadasMetros + " metros.");
		
		
	}
	
	public static void Lacos(int n) {
		
		int numeroAux = n;
		
		System.out.println("For");
		for(int i = 0; i < n; i++) {
			System.out.print("*");
		}
		
		System.out.println("");
		
		System.out.println("While");
		while(n > 0) {
			System.out.print("*");
			n--;
		}
		
		System.out.println("");
		
		System.out.println("Do/While");
		n = numeroAux;
		do {
			System.out.print("*");
			n--;
		}while (n > 0);
		
	}
	
	
	public static void QuadradoPerfeito(int n) {

		int raiz = ((int) Math.sqrt(n));
	
		if(Math.pow(raiz, 2) == n) {
			System.out.println("Quadro perfeito");
		}else {
			System.out.println("Não é um quadrado perfeito");
		}
		
	}
	
	public static void Furacoes(int vento) {
		if(vento >= 62 && vento <= 118) {
			System.out.println("Tempestade Tropical");
		}else if (vento >= 119 && vento <= 153) {
			System.out.println("Furacão categoria 1");
		}else if (vento >= 154 && vento <= 177) {
			System.out.println("Furacão categoria 2");
		}else if (vento >= 178 && vento <= 209) {
			System.out.println("Furacão categoria 3");
		}else if (vento >= 210 && vento <= 249) {
			System.out.println("Furacão categoria 4");
		}else if (vento > 249) {
			System.out.println("Furacão categoria 5");
		}else {
			System.out.println("Tempestade normal");
		}
		
	}
	
	public static void Potencia2(int n) {
		
		int verificaPotencia2 = (int) Math.sqrt(n);
		
		if (n == Math.pow(verificaPotencia2, 2)) {
			System.out.println("É potência de 2");
		}else {
			System.out.println("Não é potência de 2.");
		}
	}
	
	public static int NumerosPrimos(int n) {
		int numDivisores = 0;

		
		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				numDivisores++;
	        }        
	    }
		if(numDivisores == 2) {
			return(1);
		}else {
			return(2);
		}
		
	}
	
	public static boolean NumerosPrimos2(int n) {

		for (int i = 2; i <= n; i++) {
			if(n % i == 0) {
				return(false);
	        }        
	    }
		return(true);
	}
	
	public static void GoldBach() {
		

		
		for(int i = 700; i <= 1200; i++) {
			if(i%2 == 0) {

			}
			for (int j = 1; j <= 699; i++) {
				
				for(int k = 699; k >= 1; k--) {
					
				}
			}
		}
	}
	
	public static void Permutacao() {
		
	}
	
	public static void LogicaBooleana(boolean a, boolean b, char op) {
		
		boolean resultado = true;
		
		//Executa a lógica booleana
		
		if (op == 'A' || op == 'a'){ //AND
			
			resultado = (a & b);
			
		}else if(op == 'O' || op == 'o') { // OR
			
			resultado = (a | b);
			
		}else if(op == 'X' || op == 'x') { //XOR
			
			resultado = (a ^ b);
			
		}else if(op == 'N' || op == 'n') { //NAND
			
			resultado = !(a & b);
			
		}else {
			System.out.println("Operador inválido!");
		}
		
		
		System.out.println(a + " " + op + " " + b + " " + " : " + resultado);
	}
	

}

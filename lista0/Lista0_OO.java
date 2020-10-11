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

	public static boolean NumerosPrimos(int n) {
		int numDivisores = 0;


		for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				numDivisores++;
			}        
		}
		if(numDivisores == 2) {
			return(true);
		}else {
			return(false);
		}

	}

	//teste
	public static boolean NumerosPrimos2(int n) {

		for (int i = 2; i < n; i++) {
			if(n % i == 0) {
				return(false);
			}        
		}
		return(true);
	}

	public static void GoldBach() {

		int soma = 0;
		//if deixa o código maior, porem mais otimizado, já que utiliza uma função assintotica ao cubo

		for(int i = 700; i <= 1200; i++) {
			if(i % 2 == 0) { // numero par

				for (int j = 1; j < (i-1); j++) {

					if(NumerosPrimos(j)) {//verifica o primeiro primo

						for(int k = (i-1); k > 1; k--) {

							if(NumerosPrimos(k)){ //verifica o primeiro primo

								soma = j+k; // custo computacional 

								if(soma == i) { // comparação para verificar se encaixa na conjectura de gold bach
									System.out.println(j + " + " + k + " = " + i);
								}
							}

						}
					}
				}
			}
		}
	}

	public static void GoldBach2() {

		int soma = 0;
		boolean primoJ = false;
		boolean primoK = false;

		for(int i = 7; i <= 12; i++) {
			if(i % 2 == 0) { // verifica numero par
				for (int j = 1; j < (i-1); j++) {
					for(int k = (i-1); k > 1; k--) {

						primoJ = NumerosPrimos(j); //verificar se o número é primo, retorna true se for
						primoK = NumerosPrimos(k); //verificar se o número é primo, retorna true se for

						soma = j+k; // custo computacional 

						if(primoJ && primoK && soma == i) { // comparação para verificar se encaixa na conjectura de gold bach
							System.out.println(j + " + " + k + " = " + i);
						}
					}
				}
			}
		}
	}

	public static void PermutacaoA() {

		int frequencia = 0;

		System.out.println("Digite uma sequencia de números: ");
		String seqCaracteres = input.nextLine();
		System.out.println("Digite um caracter para ser pesquisado: ");
		char caracter = input.next().charAt(0);


		for(int i = 0; i < seqCaracteres.length(); i++) {
			if(seqCaracteres.charAt(i) == caracter) {
				frequencia++;
			}

		}
		System.out.println("O caracter " + caracter + " foi encontrado na sequencia " + seqCaracteres + " " + frequencia + " vezes.");
	}

	public static void PermutacaoB() {

		System.out.println("Digite uma sequencia de números: ");
		String seqCaracteres1 = input.nextLine();
		System.out.println("Digite outra sequencia de números: ");
		String seqCaracteres2 = input.nextLine();

		char[] v = seqCaracteres1.toCharArray();
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + " ");
		}
		
		System.out.println("");
		
		char[] x = seqCaracteres2.toCharArray();
		for (int i = 0; i < v.length; i++) {
			System.out.println(x[i] + " ");
		}
		
		//as duas sequencias devem ser do mesmo tamanho
		
		if(seqCaracteres1.length() == seqCaracteres2.length()) {

			int[] vetNumeros1 = new int[] {0,0,0,0,0,0,0,0,0,0};
			int[] vetNumeros2 = new int[] {0,0,0,0,0,0,0,0,0,0};

			for(int i = 0; i < seqCaracteres1.length(); i++) {

				vetNumeros1[ Integer.parseInt(""+seqCaracteres1.charAt(i)) ] = vetNumeros1[ Integer.parseInt(""+seqCaracteres1.charAt(i))];
				vetNumeros2[ Integer.parseInt(""+seqCaracteres2.charAt(i)) ] = vetNumeros2[ Integer.parseInt(""+seqCaracteres2.charAt(i))];			
			}
			
			//verifica se os 2 vetores sao iguais
			
			boolean vetoresIguais = true;
			for(int i = 0; i < vetNumeros1.length; i++) {
				if(vetNumeros1[i] != vetNumeros2[i]) {
					vetoresIguais = false;
				}
			}
			
			if(vetoresIguais) {
				System.out.println("A primeira sequencia é permutação da segunda.");
			}else {
				System.out.println("A primeira sequencia não é permutação da segunda.");
			}


		}else {
			System.out.println("Não são iguais");
		}

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

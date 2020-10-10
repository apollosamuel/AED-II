package fatorial;

public class potenciaIterativo {
	
	public static double potenciaIterativo (double base, int expoente) {
		double potencia = 1.0;
		while(expoente > 0) {
			potencia = potencia*base;
			expoente--;
		}
		return(potencia);
	}

	public static void main(String[] args) {
		System.out.println(potenciaIterativo.potenciaIterativo(2, 2));
	}
	
}
 

package fatorial;

public class fatorialIterativo {
	
	public static int fatorialIterativo (int n) {
		
		int resultadoFatorial = 1; 
		
		for(int i = 1; i <= n; i++) {
			resultadoFatorial = resultadoFatorial*i;
		}
		
		return(resultadoFatorial);
		
	}
	
}

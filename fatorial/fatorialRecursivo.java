package fatorial;

public class fatorialRecursivo {

	public static int fatorialRecursivo (int n) {
		
		if(n <= 1) {
			return(1);
		}else {
			return (n*fatorialRecursivo(n-1));
		}
		

		
	}

}

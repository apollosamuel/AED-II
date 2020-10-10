package fatorial;

public class MDCRecursivo {

	public static int MDCRecursivo(int dividendo, int divisor) {
		if(dividendo % divisor == 0) {
			return(divisor);
		}else {
			return (MDCRecursivo (divisor, (dividendo % divisor)));
		}
	}

		
	public static void main(String[] args) {
		System.out.println(MDCRecursivo.MDCRecursivo(50, 1242));
	}

}

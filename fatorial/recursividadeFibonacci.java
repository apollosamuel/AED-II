package fatorial;

public class recursividadeFibonacci {

	public static void main(String[] args) {

		System.out.println(fin_rec(5));

	}

	//implementar sequencia de fibonacci
	
	public static int fin_rec(int n) {
		
		if(n < 2) {
			return (n);
		}else
			return(fin_rec(n-1) + fin_rec(n-2));
		
	}
	
}

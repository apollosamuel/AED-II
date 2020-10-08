package funcoesAssintoticas;

public class estudo {

	//O(n) ou f(n) = n
	public static void On_Fn(int n) {

		for(int i = 0; i < n; i++) {
			System.out.println(" " + i);
		}

	}
	
	// AO QUADRADO
	public static void On_Fn2(int n) {

		for(int i = 0; i < n; i++) {// i ate 9 normal
			for(int x = 0; x < n; x++) {//x ate a 9 em todos os i
				System.out.println(" " + i);
			}
		}

	}
	//AO CUBO
	public static void On_Fn3(int n) {

		for(int i = 0; i < n; i++) { // i ate 9 normal
			for(int x = 0; x < n; x++) { //x ate a 9 em todos os i
				for(int y = 0; y < n; y++) { // y ate 9 em todos os X
					System.out.println(" " + i);
				}
			}
		}

	}


	public static void main(String[] args) {



	}

}

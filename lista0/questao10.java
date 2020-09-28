package lista0;

public class questao10 {

	public static void main(String[] args) {
		
		boolean a = false;
		boolean b = true;
		char op = 'o';
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

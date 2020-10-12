package ordenacao;
import java.util.*;

public class Ordenacao {


	// Gerar uma sequencia de dados aleatorios

	public static int[] geradorAleatorio(int qtde, int intervalo) {
		Random gerador = new Random();
		int[] numeros = gerador.ints(0, intervalo).limit(qtde).toArray();
		return(numeros);
	}

	//Exibe o vetor passado como parâmetro
	public static String exibirVetor(int[] vet) {
		String strVet = "";
		for(int i = 0; i < vet.length; i++) {
			strVet += vet[i] + " ";
		}
		return(strVet);
	}


	public static void BubbleSort(int[] vet) {


		for (int i = 0; i < vet.length; i++) {
			for (int x = 0; x < vet.length-1; x++) {

				if (vet[x] > vet[x+1]) {
					int temp = vet[x];
					vet[x] = vet[x+1];
					vet[x+1] = temp;
				}
			}
		}
		
		System.out.println("Vetor ordenado: " + Ordenacao.exibirVetor(vet));
		
	}

}

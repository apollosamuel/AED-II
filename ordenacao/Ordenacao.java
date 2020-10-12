package ordenacao;
import java.util.Random;

public class Ordenacao {


	// Gerar uma sequencia de dados aleatorios

	public static int[] geradorAleatorio(int qtde, int intervalo) {
		Random gerador = new Random();
		int[] numeros = gerador.ints(0, intervalo).limit(qtde).toArray(); //ints vai gerar números inteiros 
		return(numeros);                                                 //.limit = definir a quantidade de números
																		//toArray transforma os números para o vetor
	}

	//Exibe o vetor passado como parâmetro
	public static String exibirVetor(int[] vet) {
		String strVet = "";
		for(int i = 0; i < vet.length; i++) {
			strVet += vet[i] + " ";
		}
		return(strVet);
	}


	public static void bubbleSort(int[] vet) {


		for (int i = 0; i < vet.length; i++) { 
			for (int x = 0; x < vet.length-1; x++) {

				if (vet[x] > vet[x+1]) { //Verifica o vetor na posição X é maior que a posição X+1; (Esquerda é maior que a direita)
					int temp = vet[x]; //TEMP recebe X (x = 2 - temp = 2)
					vet[x] = vet[x+1]; //vet x = x+1 (1) - vet x = 1
					vet[x+1] = temp;  //vet x+1 recebe 2
				}
			}
		}
		
		System.out.println("Vetor ordenado BubbleSort: " + Ordenacao.exibirVetor(vet));
		
	}
	
	public static void insertionSort(int[] vet) {
		
		int chave, j;
		
		for(int i = 1; i < vet.length; i++) {
			chave = vet[i];
			j = i-1;
			while(j >= 0 && vet[j] > chave) {
				vet[j+1] = vet[j];
				j = chave;
			}
			vet[j+1] = vet[i];
			
		}
		System.out.println("Vetor ordenado Insertion Sort: " + Ordenacao.exibirVetor(vet));
	}

	
	public static void quickSort(int[] vet) {


		
	}

	
	public static void mergeSort(int[] vet) {


		
	}

	

}

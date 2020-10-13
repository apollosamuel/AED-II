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
				j = j-1;
			}
			vet[j+1] = chave;

		}
		System.out.println("Vetor ordenado Insertion Sort: " + Ordenacao.exibirVetor(vet));
	}


	public static int[] quickSort(int[] vet, int inicio, int fim) {

		if(inicio < fim) {
			int posicaoPivo = separar(vet, inicio, fim);
			quickSort(vet, inicio, posicaoPivo - 1);
			quickSort(vet, posicaoPivo + 1, fim);
		}
		return(vet);
	}

	private static int separar(int[] vet, int inicio, int fim) {
		int pivo = vet[inicio]; //Posição 0
		int i = inicio + 1, f = fim; // i = Posição 2, F = 7
		while (i <= f) { 
			if(vet[i] <= pivo) {
				i++;
			} else if(pivo < vet[f]) {
				f--;
			} else {
				int temp = vet [i];
				vet[i] = vet[f];
				vet[f] = temp;
				i++;
				f--;
			}
		}
		vet[inicio] = vet[f];
		vet[f] = pivo;
		return(f);
	}


	public static int[] mergeSort(int[] vet, int baixo, int alto) {


		if (baixo < alto) {
			int medio = (baixo + alto) / 2;
			mergeSort(vet, baixo, medio);
			mergeSort(vet, medio+1, alto);
			merge(vet, baixo, medio, alto);
		}
		return(vet);

	}

	public static void merge(int[] vet, int baixo, int medio, int alto) {
		int [] vetTemp = new int [vet.length];
		for(int i = baixo; i <= alto; i++) {
			vetTemp[i] = vet[i];
		}
		
		int vetEsquerdo = baixo;
		int vetDireito = medio+1;
		int atual = baixo;
		
		while(vetEsquerdo <= medio && vetDireito <= alto) {
			if (vetTemp[vetEsquerdo] <= vetTemp[vetDireito]) {
				vet[atual] = vetTemp[vetEsquerdo];
				vetEsquerdo++;
			}else{
				vet[atual] = vetTemp[vetDireito];
				vetDireito++;
			}
			atual++;
		}
		int restante = medio - vetEsquerdo;
		for(int i = 0; i <= restante; i++) {
			vet[atual+i] = vetTemp[vetEsquerdo+i];
		}
	}

}

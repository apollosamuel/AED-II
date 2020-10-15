package atividades;
import java.util.Random;


public class atividadesMultiplas {
	
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
    //Implemente, na linguagem Java de programação, o algoritmo Insertion-Sort de ordenação. 
	//Porém, considere a ordenação decrescente, ou seja, dado um vetor V de n números inteiros aleatórios, o resultado da ordenação deve apresentar um vetor ordenado do maior para o menor valor.
	
	public static void insertionSortInverso(int[] vet) {

		int chave, j;
		
		for(int i = 1; i < vet.length; i++) {
			chave = vet[i];
			j = i-1;
			while(j >= 0 && vet[j] < chave) { //Somente trocar a verificação
				vet[j+1] = vet[j];
				j = j-1;
			}
			vet[j+1] = chave;

		}
		System.out.println("Vetor ordenado decrescente c/ Insertion Sort: " + atividadesMultiplas.exibirVetor(vet));
	}


	public static void main(String[] args) {

		int vetorRandom[] = atividadesMultiplas.geradorAleatorio(10,10);
		
		System.out.println("Vetor padrão: " + atividadesMultiplas.exibirVetor(vetorRandom));
		
		atividadesMultiplas.insertionSortInverso(vetorRandom);
		





	}

}

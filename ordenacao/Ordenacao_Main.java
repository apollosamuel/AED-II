package ordenacao;

public class Ordenacao_Main {

	public static void main(String[] args) {


		int vetor[] = Ordenacao.geradorAleatorio(10,10);
		
		System.out.println("Vetor padrão: " + Ordenacao.exibirVetor(vetor));

		Ordenacao.bubbleSort(vetor);
		
		System.out.println("");
		
		System.out.println("Vetor padrão: " + Ordenacao.exibirVetor(vetor));

		Ordenacao.insertionSort(vetor);

	}

}

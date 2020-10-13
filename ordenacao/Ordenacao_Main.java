package ordenacao;

public class Ordenacao_Main {

	public static void main(String[] args) {


		int vetor[] = Ordenacao.geradorAleatorio(10,10);

		System.out.println("Vetor padrão: " + Ordenacao.exibirVetor(vetor));

		Ordenacao.bubbleSort(vetor);

		System.out.println("");

		int vetor2[] = Ordenacao.geradorAleatorio(10,10);

		System.out.println("Vetor padrão: " + Ordenacao.exibirVetor(vetor2));

		Ordenacao.insertionSort(vetor2);

		System.out.println("");

		int vetor3[] = Ordenacao.geradorAleatorio(10, 10);

		System.out.println("Vetor padrão: " + Ordenacao.exibirVetor(vetor3));

		System.out.println("Vetor ordenado Quick Sort: " + Ordenacao.exibirVetor(Ordenacao.quickSort(vetor3, 0, vetor3.length-1)));

		System.out.println("");

		int vetor4[] = Ordenacao.geradorAleatorio(10, 10);

		System.out.println("Vetor padrão: " + Ordenacao.exibirVetor(vetor4));

		System.out.println("Vetor ordenado Merge Sort: " + Ordenacao.exibirVetor(Ordenacao.quickSort(vetor4, 0, vetor3.length-1)));

	}

}

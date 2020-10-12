package ordenacao;

public class Ordenacao_BubbleSort {

	public static void main(String[] args) {


		int vetor[] = Ordenacao.geradorAleatorio(10,10);
		
		System.out.println("Vetor Desodernado: " + Ordenacao.exibirVetor(vetor));

		Ordenacao.bubbleSort(vetor);

	}

}

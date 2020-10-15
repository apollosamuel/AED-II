package fila;

public class FilaEstatica {
	
	private int inicio;
	private int fim;
	private int contador;
	private int capacidade;
	private Object[] itemArray;
	
	public FilaEstatica() {
		this(100);
	}
	
	public FilaEstatica(int maxCapacidade) {
		inicio = 0;
		fim = 0;
		contador = 0;
		capacidade = maxCapacidade;
		itemArray = new Object[capacidade];
	}
	
	public boolean vazia() {
		return(contador == 0);
	}
	
	public int tamanho() {
		return(contador);
	}
	
	
	public void enfileirar(Object newItem) {
		if(contador == capacidade) {
			System.err.println("Erro: Capacidade da fila foi excedida!");
		}else {
			itemArray[fim] = newItem;
			fim = (fim+1) % capacidade;
			contador++;
		}
	}
	
}

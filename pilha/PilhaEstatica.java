package pilha;

public class PilhaEstatica {
	
	private int topo; //Indicador do topo da pilha	
	private int contador; //Contador de itens na pilha
	private int capacidade; //Capacidade máxima da pilha
	private Object[] itemArray; //Armazenador de objetos/itens/elementos

	
	// Construtor - Sobrecarga de métodos, pois ele chama o construtor de baixo.
	public PilhaEstatica() {  
		this(10);
	}
	
	// Construtor
	public PilhaEstatica(int maxCapacidade) {
		
		topo = 0; 
		contador = 0;
		capacidade = maxCapacidade;
		itemArray = new Object[capacidade];
		
	}
	
	public boolean vazia() {
		return(topo == 0);
	}
	
	public int tamanho() {
		return(capacidade);
	}

}

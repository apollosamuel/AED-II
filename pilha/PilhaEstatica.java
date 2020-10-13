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
	
	public void empilhar(Object novoItem) {
		if(topo == capacidade) { //verifica se está cheia
			System.err.println("Erro: Capacidade da pilha foi excedida!");
		}else {
			itemArray[topo++] = novoItem; //adiciona um novo item no Array e adiciona mais 1 item no contador
			contador++;
		}
	}
	
	public Object desempilhar() {
		Object x = null; // atribui um vazio para o topo da pilha 
		if (vazia() ) {
			System.err.println("Erro: Pilha vazia!"); //verifica se esta vazia
		}else {
			x = itemArray[-- topo]; // diminui o item do topo 
			contador--; //abate no contador
		}
		return(x);
	}
	
	
	public Object consultarTopo() {
		Object x = null; // atribui um vazio para o topo da pilha 
		if(vazia() ) {
			System.err.println("Erro: Pilha vazia!"); //verifica se esta vazia
		}else {
			x = itemArray[topo-1]; //topo é sempre null, -1 serve para consultar o segundo item da lista
		}
		return(x);
	}
	
	//Imprimir a pilha
	public String toString() {
		String pilhaCompleta = "";
		if(vazia() ) {
			pilhaCompleta = null;
		}else {
			for(int i = topo-1; i >= 0; i--) { //mostra de cima pra baixo 
				pilhaCompleta = pilhaCompleta + "\n" +itemArray[i];
			}
		}
		return(pilhaCompleta);
	}
	

}

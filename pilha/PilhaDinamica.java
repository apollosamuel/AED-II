package pilha;

class Celula{

	Object item; //Armazena o item
	Celula anterior; //Referencia para o objeto anterior

	public Celula() {
		item = null;
		anterior = null;
	}

	public Celula(Object valorItem) {
		item = valorItem;
		anterior = null;
	}

	public Celula(Object valorItem, Celula celulaAnterior) {
		item = valorItem;
		anterior = celulaAnterior;
	}

}


public class PilhaDinamica {

	private Celula topo; //Referencia para o topo da pilha
	private int contador; //Contador do numero de itens na pilha

	public PilhaDinamica() {
		topo = null;
		contador = 0;
	}

	public boolean vazia() { //referencia a alguns dos itens da Celula
		return(topo == null);
	}

	public int tamanho() { //armazena quantos itens tem na pilha
		return(contador);
	}

	public void empilhar(Object novoItem) {
		Celula novaCelula = new Celula(novoItem); // cria nova celula
		novaCelula.anterior = topo; // atribui o anterior para o topo antiga (valor antigo)
		topo = novaCelula; //nova celula vira topo 
		contador++;
	}

	public Object desempilhar() {
		Object x = null;
		if (vazia()) {
			System.err.println("Erro: Pilha Vazia!");
		}else {
			Celula tempCelula = topo; // vira um segundo topo e aponta para o anterior
			topo = topo.anterior; // topo vira item anterior.
			contador--;
			x = tempCelula.item;
		}
		return(x); //item deixa de existir
	}

	public Object consultaTopo() {
		Object x = null;
		if(vazia() ) {
			System.err.println("Erro: Pilha Vazia!");
		}else {
			x = topo.item;
		}
		return(x);
	}

	public Object copiar() {
		PilhaDinamica tempPilha = new PilhaDinamica();
		PilhaDinamica copiaPilha = new PilhaDinamica();

		while(!vazia() ) {
			tempPilha.empilhar(desempilhar());
		}

		while(!tempPilha.vazia()) {
			Object x = tempPilha.desempilhar();
			empilhar(x);
			copiaPilha.empilhar(x);
		}

		return(copiaPilha);
	}
	
	public Object invertePilha() {
		
		PilhaDinamica pilhaInvertida = new PilhaDinamica();

		while(!vazia() ) {
			pilhaInvertida.empilhar(desempilhar());
		}	
		return(pilhaInvertida);
	}


	public String toString() {
		String pilhaCheia = "";

		if (vazia()) {
			pilhaCheia = null;
		}else {
			PilhaDinamica copiaPilha = (PilhaDinamica) copiar();
			while(!copiaPilha.vazia() ) {
				pilhaCheia += "\n" + copiaPilha.desempilhar();
			}
		}

		return(pilhaCheia);
	}

}


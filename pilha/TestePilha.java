package pilha;

public class TestePilha {



	public static void main(String[] args) {



		PilhaDinamica pilhaE = new PilhaDinamica();
		PilhaDinamica pilhaF = new PilhaDinamica();

		pilhaE.empilhar("C");

		pilhaE.empilhar("B");

		pilhaE.empilhar("A");
		
		pilhaE.toString();
		
		pilhaF.empilhar(pilhaE.invertePilha());
		
		System.out.println(pilhaF.toString());

		



	}

}		


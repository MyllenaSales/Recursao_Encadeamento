package questao2;
import java.util.ArrayList;
public class Metodos {
	
	private Celula cabeca;
	private Celula cauda;
	private int totalDeElementos=0;
	ArrayList<Celula> numeros = new ArrayList<Celula>();

	
	public void fazerSequencia() {
	
		Celula primeira = new Celula(0);
		Celula segunda = new Celula(1);
		this.cabeca = primeira;
		this.cauda = segunda;
		this.cauda.setAnterior(primeira);
		this.cabeca.setProxima(segunda);
		numeros.add(primeira);
		numeros.add(segunda);

		totalDeElementos=2;
		while(totalDeElementos<13) {
			
		
		Celula aux = new Celula(primeira.getNumeros()+segunda.getNumeros());
		aux.setAnterior(this.cauda);
		this.cauda.setProxima(aux);;
		this.cauda = aux;
		numeros.add(aux);
		
		primeira = segunda;
		segunda = aux;
		this.cauda = aux;
		totalDeElementos++;
		}
	}
	
	public void listar() {
		System.out.println("Sequência Fibinacci (até passar de 100):");
		for(Celula n: numeros) {
			System.out.println(n.getNumeros());
		}
	}
	
}

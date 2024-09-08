package questao2;

public class Celula {
	
	private Celula proxima;
	private Celula anterior;
	private int numeros;
	
	
	public Celula() {
		
	}
	
	public Celula(int numeros) {
		this.numeros = numeros;
	}


	public Celula(Celula proxima, Celula anterior, int numeros) {
		super();
		this.proxima = proxima;
		this.anterior = anterior;
		this.numeros = numeros;
	}


	public Celula getProxima() {
		return proxima;
	}


	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}


	public Celula getAnterior() {
		return anterior;
	}


	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}


	public int getNumeros() {
		return numeros;
	}


	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}

	
}

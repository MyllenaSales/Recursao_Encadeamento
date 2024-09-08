package questao1;

public class Celula {
	
	private Contato elemento;
	private Celula anterior;
	private Celula proxima;
	
	public Celula() {
		
	}

	public Celula(Contato elemento, Celula anterior, Celula proxima) {
		super();
		this.elemento = elemento;
		this.anterior = anterior;
		this.proxima = proxima;
	}

	public Celula (Contato elemento) {
		this.elemento = elemento;
	}
	public Contato getElemento() {
		return elemento;
	}

	public void setElemento(Contato elemento) {
		this.elemento = elemento;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	@Override
	public String toString() {
		return "Celula [elemento=" + elemento + ", anterior=" + anterior + ", proxima=" + proxima + "]";
	}
	

}

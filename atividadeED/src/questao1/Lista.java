package questao1;

public class Lista {
	
	private Celula cabeca;
	private Celula cauda;
	private int totalDeElementos=0;
	
	
	public void adicionarNoInicio(Contato elemento) {
		
		if(totalDeElementos==0) {
			Celula c = new Celula(elemento);
			this.cabeca = c;
			this.cauda = c;
		}else {
			Celula c = new Celula(elemento, null, this.cabeca);
			this.cabeca.setAnterior(c);
			this.cabeca = c;
		}
		totalDeElementos ++;
	}
	
	public void adicionarNoFinal(Contato elemento) {
		
		if(totalDeElementos ==0) {
			adicionarNoInicio(elemento);
		}else {
			Celula c = new Celula (elemento, this.cauda, null);
			this.cauda.setProxima(c);
			this.cauda = c;
		}
		totalDeElementos++;
	}
	
	public void listarElementos() {
		Celula aux = this.cabeca;
		
		while(aux!=null) {
			System.out.println(aux.getElemento());
			aux = aux.getProxima();
		}
	}
	//public void listarElementos() {
		
	//	Celula aux = this.cabeca;
		
	//	for(int i =0;i<totalDeElementos;i++) {
	//		System.out.println(aux.getElemento());
	//		aux = aux.getProxima();
	//	}
	//}
	
	public void adicionarPorPosicao(Contato elemento, int posicao) {
		
		if(posicao<0 || posicao>totalDeElementos) {
			System.out.println("Posição inválida");
		}
		if(posicao==0) {
			adicionarNoInicio(elemento);
		}
		if(posicao==totalDeElementos) {
			adicionarNoFinal(elemento);
		}
		if(posicao>0 && posicao<totalDeElementos) {
			
			Celula aux = this.cabeca;
			for(int i =0; i<posicao-1; i++) {
				aux = aux.getProxima();
			}
			Celula c = new Celula(elemento);
			c.setProxima(aux.getProxima());
			aux.setProxima(c);
			c.setAnterior(aux);
			
		}
		
		totalDeElementos++;
	}
	
	public void removerDoFinal() {
		Celula c = this.cauda.getAnterior();
		c.setProxima(null);
		this.cauda = c;
		totalDeElementos--;
	}
	
	public void removerDoInicio() {
		
		Celula c = this.cabeca.getProxima();
		this.cabeca.setProxima(null);
		this.cabeca = c;
		this.cabeca.setAnterior(null);
		totalDeElementos--;
	}
	
	public void removerPorPosicao(int posicao) {
		
		if(posicao==totalDeElementos) {
			removerDoFinal();
		}
		if(posicao==0) {
			removerDoInicio();
		}
		if(posicao>0 && posicao< totalDeElementos) {
			Celula aux = this.cabeca;
			
			for(int i=0; i<posicao-1; i++) {
				aux = aux.getProxima();
				
			}
			Celula c = aux.getProxima();
			aux.setProxima(c.getProxima());
			c.setProxima(null);
			c.setAnterior(null);
			
		}
		totalDeElementos--;
	}
	
	public void pesquisarPorNome(String nome) {
		
		Celula aux = this.cabeca;
		for(int i=0;i<totalDeElementos;i++) {
			aux = aux.getProxima();
			if(aux.getElemento().getNome().equalsIgnoreCase(nome)) {
				System.out.println(aux.getElemento().toString());
			}
			
		}
		
	}
	
}
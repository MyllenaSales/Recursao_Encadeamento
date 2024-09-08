package questao1;

public class Principal {

	public static void main(String[] args) {
		
		Contato c1 = new Contato("Moranguinho","Morangolândia","4002-8922");
		Contato c2 = new Contato("Cerejinha","Cerejolândia","1234-1234");
		Contato c3 = new Contato("Laranjinha","Laranjolândia","2233-4455");
		Contato c4 = new Contato("Biscoitinho","Biscoitolândia","9988-7766");
		Contato c5 = new Contato("ana","Morangolândia","2132-5443");

		Lista l = new Lista();
		l.adicionarNoInicio(c1);
		l.adicionarNoInicio(c2);
		l.adicionarNoInicio(c3);
		l.adicionarNoInicio(c4);
		l.adicionarNoInicio(c5);

		l.listarElementos();

	}
}
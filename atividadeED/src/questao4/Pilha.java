package questao4;
import java.util.Stack;
public class Pilha {

	Stack <Character> pilha = new Stack <Character>();
	
	public void verificarSePolindromo(String palavra) {
		
		for(int i=0;i<palavra.length();i++) {
			pilha.push(palavra.charAt(i));
			
		}
	
		String palavraInvertida = "";
		while(!pilha.isEmpty()) {
			palavraInvertida+= pilha.pop();
		}
		
		if(palavraInvertida.equalsIgnoreCase(palavra)) {
			System.out.println("É um políndromo");
		}else {
			System.out.println("Não é um políndromo");
		}
	
	}
	
}

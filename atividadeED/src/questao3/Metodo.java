package questao3;
import java.util.Stack;
public class Metodo {

	  Stack<Character> conversao = new Stack<Character>();

	  double soma=0;
	  public void conversaoValores(String numero) {
		  
		  for(int i=0;i<numero.length();i++) {
			  conversao.push(numero.charAt(i));
			 
		  }
				   
		  for(int i=0;i<numero.length();i++) {
			  
			  char c = conversao.pop();
			  
			  double valor = Character.getNumericValue(c);
			  
			  double resultado = valor * Math.pow(2, i);
			  soma = soma+resultado;
		  }
		  
		  System.out.println(soma);
		  
	  }
	
}

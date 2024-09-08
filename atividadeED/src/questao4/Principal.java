package questao4;
import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Digite umas palavra e descubra se é um políndromo: ");
		Pilha p = new Pilha();
		p.verificarSePolindromo(input.nextLine());
		
		input.close();
		
	}
}

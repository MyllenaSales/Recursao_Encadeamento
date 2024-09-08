package questao3;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Digite o valor binario para converter para decimal: ");
		Metodo m = new Metodo();
		m.conversaoValores(input.nextLine());
		
		input.close();
	}
}
	

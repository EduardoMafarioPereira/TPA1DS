package prjAula022;
import java.util.Scanner;
public class AntecessorESucessor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor1, antecessor, sucessor;
		System.out.println("Insira o n�mero desejado:");
		valor1 = ler.nextInt();
		antecessor = valor1-1;
		sucessor = valor1+1;
		System.out.println("O sucessor desse n�mero �: "+sucessor);
		System.out.println("O antecessor desse n�mero �: "+antecessor);
		ler.close();
		

	}

}

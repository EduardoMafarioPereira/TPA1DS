package prjAula23;
import java.util.Scanner;

public class SinalNumero {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.println("Insira um n�mero pra saber seu sinal: ");
		numero = ler.nextInt();
		if (numero <0) {
			System.out.println("Seu n�mero � negativo");
		}
		else if (numero ==0 ) {
			System.out.println("Seu n�mero � neutro, ou seja, zero");
		}
		else {
			System.out.println("Seu n�mero � positivo");
		}
		ler.close();
	}

}

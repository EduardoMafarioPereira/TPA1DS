package prjAula24;
import java.util.Scanner;
public class idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anoAtual, anoNascido, idade;
		System.out.println("Insira o ano atual: ");
		anoAtual = ler.nextInt();
		System.out.println("Insira o ano em que voc� nasceu: ");
		anoNascido = ler.nextInt();
		idade = anoAtual - anoNascido;
		if (idade <10) {
			System.out.println("Voc� � uma Crian�a");
		}
		else if (idade <18) {
			System.out.println("Voc� � um Adolescente");
		}
		else if (idade <60) {
			System.out.println("Voc� � um Adulto");
			}
		else {
					System.out.println("Voc� � um Idoso");
		}
		ler.close();
	}

}

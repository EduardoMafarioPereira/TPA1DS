package prjAula022;
import java.util.Scanner;
public class MetrosParaQuilometros {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double metros, quilometros;
		System.out.println("Insira a dist�ncia em metros");
		metros = ler.nextDouble();
		quilometros = metros/1000;
		System.out.println("a dist�ncia �, em quilometros "+quilometros );
		ler.close();
 
	}

}

package prjAula23;
import java.util.Scanner;
public class Temperatura {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double fahrenheit, celsius;
		System.out.println("Insira a temperatura em fahrenheit: ");
		fahrenheit = ler.nextDouble();
		celsius = (fahrenheit - 32)* 5/9;
		if (celsius < 15 ) {
			System.out.println("O clima est� frio");
		}
		else if (celsius <22) {
			System.out.println("O clima est� ameno");
			
		}
		else {
			System.out.println("Est� calor");
		}
		ler.close();
	}

}

package prjAula23;
import java.util.Scanner;
public class SalarioLido {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		double salario;
		System.out.println("Insira seu sal�rio");
		salario = ler.nextDouble();
		if (salario <1302 ) {
			System.out.println("Seu sal�rio est� abaixo do sal�rio m�nimo no brasil");		
		}
		else {
			System.out.println("Seu sal�rio est� acima do sal�rio m�nimo no brasil");
		}
		ler.close();

	}

}

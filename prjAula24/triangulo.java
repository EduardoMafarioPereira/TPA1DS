package prjAula24;
import java.util.Scanner;
public class triangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, c;
		System.out.println("Insira o valor do primeiro �ngulo");
		a = ler.nextDouble();
		System.out.println("Insira o valor do segundo �ngulo");
		b = ler.nextDouble();
		System.out.println("Insira o valor do terceiro �ngulo");
		c = ler.nextDouble();
		if (a > b+c && b> a+c && c > b+a ) {
			System.out.println("N�o � tri�ngulo");
		}
		else if (a == b && b==c)  {
			System.out.println("Tri�ngulo equil�tero");
		}
		else {
			if (a != b && b != c && a != c ) {
				System.out.println("Tri�ngulo escaleno");
			}
			else {
				System.out.println("Tri�ngulo is�sceles");
			}
		}
		ler.close();

	}
 
} 

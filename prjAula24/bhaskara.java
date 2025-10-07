package prjAula24;
import java.util.Scanner;
import java.lang.Math;
public class bhaskara {

	public static void main(String[] args) {
		double delta, x1, x2, a, b, c;
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o valor de a");
		a = ler.nextDouble();
		System.out.println("Insira o valor de b");
		b = ler.nextDouble();
		System.out.println("Insira o valor de c");
		c = ler.nextDouble();
		// f�rmula do delta � (b*b)-4*a*c pra descobrir a quantidade de ra�zes e tamb�m o delta//
		delta = (b*b)-4*a*c;
		
		if (delta<0) {
			System.out.println("N�o existe ra�zes reais para essa fun��o");
		}
		else if (delta==0) {
				System.out.println("Existe uma ra�z real para essa equa��o");
			}
		else {
				System.out.println("Existem duas ra�zes reais para essa equa��o");
		}
		
		//f�rmula de bhaskara pra descobrir o valor das ra�zes // 
		x1 = (-b+ Math.sqrt(delta))/(2*a);
		x2 = (-b- Math.sqrt(delta))/(2*a);
		System.out.println("O valor da primeira ra�z �: "+x1);
		System.out.println("O valor da segunda ra�z �: "+x2);
		ler.close();
	}

}

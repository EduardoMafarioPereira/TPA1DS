package prjAula022;
import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double base, altura, area;
		System.out.print("coloque a base do tri�ngulo");
		base = ler.nextDouble();
				
		System.out.println("Coloque a altura do tri�ngulo");
		altura = ler.nextDouble();
		
		area = (base*altura)/2;
		System.out.println("a �rea do tri�ngulo �: "+area);
		ler.close();
		
		
	}

}

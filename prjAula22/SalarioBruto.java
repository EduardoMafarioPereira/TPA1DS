package prjAula022;
import java.util.Scanner;
public class SalarioBruto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salarioBruto, salarioInss, salarioVale, salarioLiquido;
		System.out.println("Insira seu sal�rio bruto:");
		salarioBruto = ler.nextDouble();
		salarioInss = salarioBruto/100*8;
		salarioVale = salarioBruto/100*6;
		salarioLiquido = salarioBruto-salarioVale- salarioInss;
		System.out.println("Seu sal�rio liquido � "+salarioLiquido+ "$Reais");
		ler.close();

	}

}

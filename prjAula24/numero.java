package prjAula24;
import java.util.Scanner;
public class numero {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b ,c,d;
		System.out.println("Insira o valor do primero n�mero");
		a = ler.nextInt();
		System.out.println("Insira o valor do segundo n�mero");
		b = ler.nextInt();
		System.out.println("Insira o valor do terceiro n�mero");
		c = ler.nextInt();
		if (a >b) {
			d = a;
			a = b;
			b = d;
		}
	
		if(b>c){
			d = b;
			b = c;
			c = d;
		}
		if (a >b) {
			d = a;
			a = b;
			b = d;
		}	
		
		
        
		System.out.println(a+", "+b+", "+c);
		ler.close();
		
	}

}

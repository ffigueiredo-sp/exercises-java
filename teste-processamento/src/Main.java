//import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// EXEMPLO 1 E 2
		// int x, y;
		/*
		 * int x; double y; x = 5; y = 2 * x; System.out.println(x);
		 * System.out.println(y);
		 */

		// EXEMPLO 3
		/*
		 * double b, B, h, area; b = 6.0; B = 8.0; h = 5.0; area = (b + B) / 2.0 * h;
		 * System.out.println(area);
		 */

		// EXEMPLO 3
		/*
		 * int a, b; double resultado; a = 5; b = 2; resultado = (double) a / b;
		 * System.out.println(resultado);
		 */

		// EXEMPLO 4 CAPTURA DADOS TECLADO
		/*
		 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
		 * 
		 * String x; int y; double z;
		 * 
		 * x = sc.next(); y = sc.nextInt(); z = sc.nextDouble();
		 * 
		 * System.out.println("Dados digitados: "); System.out.println(x);
		 * System.out.println(y); System.out.println(z); sc.close();
		 */

		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
	}

}

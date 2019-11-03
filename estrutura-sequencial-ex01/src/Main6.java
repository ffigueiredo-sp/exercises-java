import java.util.Locale;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// EX06
		Locale.setDefault(Locale.US);
		double A, B, C, pi = 3.14159;
				
		Scanner sc = new Scanner(System.in);

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
						
		System.out.printf("TRIANGULO = %.3f%n", (A * C) / 2);
		System.out.printf("CIRCULO = %.3f%n", pi * Math.pow(C, 2));
		System.out.printf("TRAPEZIO = %.3f%n", ((A + B) / 2 )* C);
		System.out.printf("QUADRADO = %.3f%n", B * B);
		System.out.printf("RETANGULO = %.3f%n", A * B);

		sc.close();

	}

}

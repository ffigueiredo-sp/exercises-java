import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		//EX02
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159 ;
		double valorRaio = sc.nextDouble();		
		double formulaArea = pi * Math.pow(valorRaio, 2) ;
		
		System.out.printf("Valor do raio de um círculo = %.4f%n", formulaArea);
			
		sc.close();

	}

}

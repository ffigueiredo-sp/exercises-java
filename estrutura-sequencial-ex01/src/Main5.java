import java.util.Locale;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		//EX05
		Locale.setDefault(Locale.US);
		int codPeca1, codPeca2,qndPeca1, qndPeca2;
		double valPeca1,valPeca2,valorPagarFinal;	
		
		Scanner sc = new Scanner(System.in);
		
		codPeca1 = sc.nextInt();
		qndPeca1 = sc.nextInt();
		valPeca1 = sc.nextDouble();
	
		codPeca2 = sc.nextInt();
		qndPeca2 = sc.nextInt();
		valPeca2 = sc.nextDouble();
		
		valorPagarFinal = (qndPeca1 * valPeca1) + (qndPeca2 * valPeca2);
				
		System.out.printf("Valor a pagar = R$ %.2f", valorPagarFinal);
		
		sc.close();
	}

}

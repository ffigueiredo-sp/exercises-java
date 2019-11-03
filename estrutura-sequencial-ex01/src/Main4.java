import java.util.Locale;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		//EX04
		Locale.setDefault(Locale.US);
		int numFunc, horasTrab;
		double valHora, salFunc;
		
		Scanner sc = new Scanner(System.in);
		
		numFunc = sc.nextInt();
		horasTrab = sc.nextInt();
		valHora = sc.nextDouble();
		salFunc = valHora * horasTrab;
		
		System.out.printf("O funcionário do numero %d, recebeu U$ %.2f de salario.",numFunc, salFunc);
		
		sc.close();
		

	}

}

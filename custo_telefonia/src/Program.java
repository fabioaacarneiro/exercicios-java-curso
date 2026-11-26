import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/** 
		 * Uma operadora de telefonia cobra R$50,00 reais por um plano básico que
		 * dá direito a 100 minutos de telefone. Cada minuto que exceder a franquia
		 * de 100 minutos custará R$2,00 reais. Fazer um programa para ler os minutos
		 * que a pessoa consumiu, daí mostrar o valor a ser pago.
		 * 
		 * ex: entrada                             saída
		 *     22                                  Valor a ser pago: R$50,00
		 *     103                                 Valor a ser pago: R$56,00
		 * **/
		
		Scanner sc = new Scanner(System.in);
		String msg = "Valor a ser pago: R$";
		double valor = 50.00f;

		System.out.print("Quanto minutos foram usados? ");
		int qtdMinutos = sc.nextInt();
		sc.nextLine();
		
		if (qtdMinutos > 100) {
			valor += (float) (qtdMinutos - 100) * 2;
		}
		
		System.out.printf("%s %.2f\n", msg, valor);
		
		sc.close();
	}

}

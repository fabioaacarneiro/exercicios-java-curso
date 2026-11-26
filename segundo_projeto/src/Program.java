import java.util.Scanner;

void main () {
	IO.println("Olá Mundo");
	Scanner sc = new Scanner(System.in);
	IO.print("qual o seu nome? ");
	String nome = sc.nextLine();
	IO.println("Otimo, seu nome é " + nome);
	sc.close();
}
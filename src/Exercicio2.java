import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		/* Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos,
		solicite ao usu�rio que digite o tempo de um filme em minutos e informe a dura��o
		desse filme em horas e em segundos. */
		
		Scanner leitor = new Scanner(System.in);
		int tempoEmMinutos;
		
		System.out.print("Digite a dura��o do filme em minutos: ");
		tempoEmMinutos = leitor.nextInt();
		
		System.out.println("A dura��o do filme em horas �: " + ((double)tempoEmMinutos/60) + " horas.\n"
						  + "A dua��o do filme em segundos �: " + (tempoEmMinutos*60) + " segundos.");
		leitor.close();
	}

}

import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		/* Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos,
		solicite ao usu�rio que digite o tempo de um filme em minutos e informe a dura��o
		desse filme em horas e em segundos. */
		
		Scanner leitor = new Scanner(System.in);
		int tempoEmMinutos;
		String tempoEmHoras;
		
		System.out.print("Digite a dura��o do filme em minutos: ");
		tempoEmMinutos = leitor.nextInt();
		tempoEmHoras = String.format("%.2f", (tempoEmMinutos/60.0));
		
		System.out.println("A dura��o do filme em horas �: " + tempoEmHoras + " horas.\n"
						  + "A dua��o do filme em segundos �: " + (tempoEmMinutos*60) + " segundos.");
		leitor.close();
	}

}

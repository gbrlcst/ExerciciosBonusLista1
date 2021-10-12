import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		/* Sabendo que cada hora dura 60 minutos e que cada minuto dura 60 segundos,
		solicite ao usuário que digite o tempo de um filme em minutos e informe a duração
		desse filme em horas e em segundos. */
		
		Scanner leitor = new Scanner(System.in);
		int tempoEmMinutos;
		String tempoEmHoras;
		
		System.out.print("Digite a duração do filme em minutos: ");
		tempoEmMinutos = leitor.nextInt();
		tempoEmHoras = String.format("%.2f", (tempoEmMinutos/60.0));
		
		System.out.println("A duração do filme em horas é: " + tempoEmHoras + " horas.\n"
						  + "A duação do filme em segundos é: " + (tempoEmMinutos*60) + " segundos.");
		leitor.close();
	}

}

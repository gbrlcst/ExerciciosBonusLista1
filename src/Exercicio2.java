import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int tempoEmMinutos;
		
		System.out.print("Digite a duração do filme em minutos: ");
		tempoEmMinutos = leitor.nextInt();
		
		System.out.println("A duração do filme em horas é: " + ((double)tempoEmMinutos/60) + " horas.\n"
						  + "A duação do filme em segundos é: " + (tempoEmMinutos*60) + " segundos.");
		leitor.close();
	}

}

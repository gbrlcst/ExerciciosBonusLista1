import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int tempoEmMinutos;
		
		System.out.print("Digite a dura��o do filme em minutos: ");
		tempoEmMinutos = leitor.nextInt();
		
		System.out.println("A dura��o do filme em horas �: " + ((double)tempoEmMinutos/60) + " horas.\n"
						  + "A dua��o do filme em segundos �: " + (tempoEmMinutos*60) + " segundos.");
		leitor.close();
	}

}

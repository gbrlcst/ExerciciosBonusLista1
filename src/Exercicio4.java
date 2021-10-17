import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		/* 4 – Um robô de combate só deve ativar sua arma principal quando o inimigo está a
		menos de 70cm de distância. Faça um programa onde o usuário informe a distância do
		inimigo e sejam exibidas as mensagens “ATIVADO” ou “DESATIVADO” dependendo do
		status da arma. */
		Scanner leitor = new Scanner(System.in);
		double distancia;
		
		System.out.print("Informe a distância do inimigo do robô em cm: ");
		distancia = leitor.nextDouble();
		
		if(distancia < 70) {
			System.out.println("ATIVADO");
		} else {
			System.out.println("DESATIVADO");
		}
		
		leitor.close();

	}

}

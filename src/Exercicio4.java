import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		/* 4 � Um rob� de combate s� deve ativar sua arma principal quando o inimigo est� a
		menos de 70cm de dist�ncia. Fa�a um programa onde o usu�rio informe a dist�ncia do
		inimigo e sejam exibidas as mensagens �ATIVADO� ou �DESATIVADO� dependendo do
		status da arma. */
		Scanner leitor = new Scanner(System.in);
		double distancia;
		
		System.out.print("Informe a dist�ncia do inimigo do rob� em cm: ");
		distancia = leitor.nextDouble();
		
		if(distancia < 70) {
			System.out.println("ATIVADO");
		} else {
			System.out.println("DESATIVADO");
		}
		
		leitor.close();

	}

}

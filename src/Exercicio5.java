import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		/* 5 � Um drone de limpeza de ruas deve escolher carregar sempre o lixo de menor peso.
		Entre os pesos de 3 lixos informados pelo usu�rio, um programa deve indicar qual deles
		deve ser carregado pelo drone. */
		Scanner leitor = new Scanner(System.in);
		double lixo1, lixo2, lixo3;
		
		System.out.print("Digite o peso em Kg do lixo 1: ");
		lixo1 = leitor.nextDouble();
		
		System.out.print("Digite o peso em Kg do lixo 2: ");
		lixo2 = leitor.nextDouble();

		System.out.print("Digite o peso em Kg do lixo 3: ");
		lixo3 = leitor.nextDouble();
		
		if(lixo1 == lixo2 || lixo1 == lixo3 || lixo2 == lixo3) {
			System.out.println("Forma encontrados lixos com o mesmo peso, o drone n�o � capaz de escolher.");
		} else if(lixo1 < lixo2 && lixo1 < lixo3) {
			System.out.println("O lixo carregado ser� o 1�, que pesa " + lixo1 + "Kg");
		} else if(lixo2 < lixo3) {
			System.out.println("O lixo carregado ser� o 2�, que pesa " + lixo2 + "Kg");
		} else {
			System.out.println("O lixo carregado ser� o 3�, que pesa " + lixo3 + "Kg");
		}
		
		leitor.close();

	}

}

import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		/* Para um ano de nascimento fornecido pelo usu�rio, informe a idade que ele ter� no
		dia 31 de dezembro de 2021. */
		
		Scanner leitor = new Scanner(System.in);
		int anoDeNascimento;
		System.out.print("Digite seu ano de nascimento: ");
		anoDeNascimento = leitor.nextInt();
		
		System.out.println("Sua idade �: " + (2021 - anoDeNascimento) + " anos.");
		leitor.close();
	}

}

import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		/* 3 – Solicite ao usuário a digitação de 2 números inteiros, nas variáveis A e B. Sem usar
		uma terceira variável, troque os valores de A e B entre si. */
		Scanner leitor = new Scanner(System.in);
		int valorA, valorB;
		
		System.out.print("Digite o valor A: ");
		valorA = leitor.nextInt();
		
		System.out.print("Digite o valor B: ");
		valorB = leitor.nextInt();
		
		System.out.println("Valor A: " + valorA + "\nValor B: " + valorB);
		System.out.println("...Invertendo valores...");
		
		valorA = valorA + valorB;
		valorB = valorA - valorB;
		valorA = valorA - valorB;
		
		System.out.print("Valor A: " + valorA + "\nValor B: " + valorB);
		
		leitor.close();

	}

}

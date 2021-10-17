import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		/* 6 � Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom
		�DIADEFESTA�. Fa�a um programa onde o funcion�rio digite o valor da compra e um
		cupom, informando o valor final a ser pago. */
		Scanner leitor = new Scanner(System.in);
		double valorDaCompra;
		int possuiCupom;
		String cupom, valorFinal;
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		System.out.print("Digite o valor da compra: ");
		valorDaCompra = leitor.nextDouble();
		
		System.out.println("Possui cupom? \n1 - Sim \n2 - N�o");
		possuiCupom = leitor.nextInt();
		
		switch(possuiCupom) {
		case 1:
			System.out.print("Digite o cupom: ");
			cupom = leitor.next();
			
			if(cupom.equals("DIADEFESTA")) {
				valorDaCompra *= 0.97;
				valorFinal = formatar.format(valorDaCompra);
				System.out.println("O valor total da compra com desconto �: R$" + valorFinal);
			} else {
				valorFinal = formatar.format(valorDaCompra);
				System.out.println("O valor total da compra �: R$" + valorFinal);
			}
			break;
			
		case 2:
			valorFinal = formatar.format(valorDaCompra);
			System.out.println("O valor total da compra �: R$" + valorFinal);
			break;
			
		default:
			valorFinal = formatar.format(valorDaCompra);
			System.out.println("Valor n�o aceito, compra sem desconto.");
			System.out.println("O valor total da compra �: R$" + valorFinal);
			break;
		}
		
		leitor.close();

	}

}

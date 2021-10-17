import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		/* 6 – Uma loja oferece um desconto de 3% aos clientes que tiverem o cupom
		“DIADEFESTA”. Faça um programa onde o funcionário digite o valor da compra e um
		cupom, informando o valor final a ser pago. */
		Scanner leitor = new Scanner(System.in);
		double valorDaCompra;
		int possuiCupom;
		String cupom, valorFinal;
		DecimalFormat formatar = new DecimalFormat("0.00");
		
		System.out.print("Digite o valor da compra: ");
		valorDaCompra = leitor.nextDouble();
		
		System.out.println("Possui cupom? \n1 - Sim \n2 - Não");
		possuiCupom = leitor.nextInt();
		
		switch(possuiCupom) {
		case 1:
			System.out.print("Digite o cupom: ");
			cupom = leitor.next();
			
			if(cupom.equals("DIADEFESTA")) {
				valorDaCompra *= 0.97;
				valorFinal = formatar.format(valorDaCompra);
				System.out.println("O valor total da compra com desconto é: R$" + valorFinal);
			} else {
				valorFinal = formatar.format(valorDaCompra);
				System.out.println("O valor total da compra é: R$" + valorFinal);
			}
			break;
			
		case 2:
			valorFinal = formatar.format(valorDaCompra);
			System.out.println("O valor total da compra é: R$" + valorFinal);
			break;
			
		default:
			valorFinal = formatar.format(valorDaCompra);
			System.out.println("Valor não aceito, compra sem desconto.");
			System.out.println("O valor total da compra é: R$" + valorFinal);
			break;
		}
		
		leitor.close();

	}

}

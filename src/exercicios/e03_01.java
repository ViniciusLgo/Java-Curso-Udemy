package exercicios;

import java.util.Scanner;

public class e03_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	// Case 1

		int minutos = sc.nextInt();
		double conta = 50;

		if (minutos > 100) {
			conta += (minutos - 100) * 2;
		}

		System.out.printf("O valor da conta = R$ %.2f", conta);

	// Case 2

		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
	}

}

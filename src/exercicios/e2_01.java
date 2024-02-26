package exercicios;

import java.util.Scanner;

public class e2_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	// Case 1
		
		String s1, s2, s3;

		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println();
		
		sc.close();

		// Case 2
		
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x); // Recebe raiz quadrada de x
		B = Math.sqrt(y); // Recebe raiz quadrada de y
		C = Math.sqrt(25.0); // Recebe raiz quadrada de 25
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);		// Recebe x elevado a y
		B = Math.pow(x, 2.0); 	// Recebe x elevado a 2
		C = Math.pow(5.0, 2.0); // Recebe 5 elevado a 2
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y); // Recebe valor absoluto de y
		B = Math.abs(z); // Recebe valor absoluto de z
		
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		
		

	}

}

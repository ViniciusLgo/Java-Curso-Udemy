package java_curso_udemy;

import java.util.Scanner;

public class a2_entradadedados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	// Case 1 
		
		String x;
		
		System.out.println("Digite algo:");
		x = sc.next();
		System.out.println("vc digitou " + x );
		
		
	// Case 2 
		
		int z;
		
		System.out.println("e agr digite um numero:");
		z = sc.nextInt();
		System.out.println("vc digitou " + z );
		
		
	// Case 3
		
				double y;
				
				System.out.println("e agr digite outro numero:");
				y = sc.nextDouble();
				System.out.println("vc digitou " + y );

	}

}

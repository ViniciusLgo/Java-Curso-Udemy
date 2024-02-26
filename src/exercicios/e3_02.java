package exercicios;
import java.util.Scanner;
public class e3_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextInt();
		
	double soma = 0;

	while(x!= 0){
		soma = soma + x;
		x = sc.nextDouble();
	
		}
		
	System.out.println("A soma deu " + soma);
	System.out.printf("A soma deu %.2f", soma);
	
		sc.close();
			
	}

}

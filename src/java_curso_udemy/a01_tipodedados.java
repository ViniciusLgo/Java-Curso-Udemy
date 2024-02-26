package java_curso_udemy;

public class a01_tipodedados {

	public static void main(final String[] args) {
		int y = 32;
		double x = 10.65489;
		String nome = "matilda";
		int idade = 31;
		double renda = 4000.0;



		System.out.println(y);
		
		//printf determina que vai ser um valor formatado

		// "%.2f%n",x = %.2f "quantidade de casas"
		//			  = %n "quebrar de linha"
		//			  = ,x "variavel que vai ser declarada"

		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		System.out.printf("%.5f%n",x);
		
		System.out.println("Resultado foi = "+ x + " Metros");
		
		System.out.printf("RESULTADO = %.2f metros%n", x);

		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	
	
	
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
			System.out.println();
		
	}
	

}

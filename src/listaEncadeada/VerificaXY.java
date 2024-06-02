package listaEncadeada;

import java.util.Scanner;
import java.util.Stack;

public class VerificaXY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a ordem para verificar se é XY:");
        String ordem = scanner.nextLine();
        
        System.out.println(ordem + " é XY? " + verificaXY(ordem));
        
        // Imprime as variáveis teste1 e teste2
        String teste1 = "ABCCBA";
        String teste2 = "ABCDCBA";
        System.out.println("teste1: " + teste1);
        System.out.println("teste2: " + teste2);
    }
    
    public static boolean verificaXY(String str) {
        int tamanho = str.length();
        int metade = tamanho / 2;
        Stack<Character> pilha = new Stack<>();
        
        // Empilhar a primeira metade da string na pilha
        for (int i = 0; i < metade; i++) {
            pilha.push(str.charAt(i));
        }
        
        // Verificar se os caracteres restantes correspondem ao reverso de X
        for (int i = metade; i < tamanho; i++) {
            char caractereAtual = str.charAt(i);
            char topoDaPilha = pilha.pop();
            if (caractereAtual != topoDaPilha) {
                return false; // Caracteres diferentes, não é da forma XY
            }
        }
        
        // Se a pilha estiver vazia, significa que todos os caracteres de X e Y são iguais
        return pilha.isEmpty();
    }
}

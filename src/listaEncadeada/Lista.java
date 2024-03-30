package listaEncadeada;

import java.util.ArrayList;
import java.util.Scanner;


public class Lista {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> lista = new ArrayList<Integer>();
            boolean continuar = true;
            int opcao;

            while (continuar) {
                System.out.println("-----------Lista----------");
                System.out.println("1-> Adicionar item.");
                System.out.println("2-> Remover item.");
                System.out.println("3-> Atualizar item.");
                System.out.println("4-> Mostrar Lista.");
                System.out.println("5-> Ordenar Lista.");
                System.out.println("6-> Inverter Lista.");
                System.out.println("7-> Sair.");
                System.out.println("==========================");
                System.out.print("Escolha uma opção: ");

                opcao = scanner.nextInt();
                System.out.println();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        adicionarItem(scanner, lista);
                        sort(lista);
                        break;
                    case 2:
                        removerItem(scanner, lista);
                        break;
                    case 3:
                        atualizarItem(scanner, lista);
                        break;
                    case 4:
                        mostrarLista(lista);
                        break;
                    case 5:
                        sort(lista);
                        break;
                    case 6:
                        invert(lista);
                        break;
                    case 7:
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção Inválida. Tente novamente!");
                }
            }
            scanner.close();
        }
    }

    public static void adicionarItem(Scanner scanner, ArrayList<Integer> lista) {
        int item;
        System.out.print("Digite o item a ser adicionado: ");
        item = scanner.nextInt();
        lista.add(item);
        System.out.println();
        System.out.println("Item Adicionado!");
        System.out.println();
    }

    public static void removerItem(Scanner scanner, ArrayList<Integer> lista) {
        int itemRemovido;
        int numeroItem;
        System.out.print("Digite o item a ser removido: ");
        numeroItem = scanner.nextInt();
        System.out.println();
        if (numeroItem >= 1 && numeroItem <= lista.size()) {
            itemRemovido = lista.remove(numeroItem - 1);
            System.out.println("Item \"" + itemRemovido + "\" foi removido da lista.");
        } else {
            System.out.println("Número de item Inválido!");
        }
    }

    public static void atualizarItem(Scanner scanner, ArrayList<Integer> lista) {
        int numeroItem;
        System.out.print("Digite o item a ser alterado: ");
        numeroItem = scanner.nextInt();
        scanner.nextLine();
        if (numeroItem >= 1 && numeroItem <= lista.size()) {
            lista.remove(numeroItem - 1);
            System.out.print("Digite o novo item: ");
            lista.add(numeroItem - 1, scanner.nextInt());
            System.out.println("Lista Atualizada!");
        } else {
            System.out.println("Número de item Inválido!");
        }
    }

    public static void mostrarLista(ArrayList<Integer> lista) {
        System.out.println("-----------Lista----------");
        if (lista.isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            for (int contador = 0; contador < lista.size(); contador++) {
                System.out.println((contador + 1) + ". " + lista.get(contador));
            }
        }
        System.out.println("==========================");
        System.out.println();
    }

    public static void sort(ArrayList<Integer> lista) {
        lista.sort(null);
        System.out.println("Lista Ordenada!");
    }

    public static void invert(ArrayList<Integer> lista){
        for (int contI = 0, contJ = lista.size() - 1; contI < contJ; contI++){
            lista.add(contI, lista.remove(contJ));
        }
        System.out.println("Lista Invertida!");
    }
}
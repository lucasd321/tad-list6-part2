import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Defina a capacidade da lista: ");
        int cap = leitor.nextInt();
        MyArrayList minhaLista = new MyArrayList(cap);

        int opcao = 0;

        while (opcao != 9) {
            System.out.println("\n--- MENU DE OPERAÇÕES ---");
            System.out.println("1. Inserir no Início (addFirst)");
            System.out.println("2. Inserir no Fim (addLast)");
            System.out.println("3. Inserir Ordenado (addSorted)");
            System.out.println("4. Remover do Início (removeFirst)");
            System.out.println("5. Remover do Fim (removeLast)");
            System.out.println("6. Remover Valor Específico (remove)");
            System.out.println("7. Buscar Índice (find)");
            System.out.println("8. Exibir Lista (display)");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor: ");
                    minhaLista.addFirst(leitor.nextInt());
                    break;
                case 2:
                    System.out.print("Valor: ");
                    minhaLista.addLast(leitor.nextInt());
                    break;
                case 3:
                    System.out.print("Valor: ");
                    minhaLista.addSorted(leitor.nextInt());
                    break;
                case 4:
                    minhaLista.removeFirst();
                    System.out.println("Primeiro elemento removido.");
                    break;
                case 5:
                    minhaLista.removeLast();
                    System.out.println("Último elemento removido.");
                    break;
                case 6:
                    System.out.print("Qual valor deseja remover? ");
                    minhaLista.remove(leitor.nextInt());
                    break;
                case 7:
                    System.out.print("Valor para buscar: ");
                    int valor = leitor.nextInt();
                    int pos = minhaLista.find(valor);
                    System.out.println(pos != -1 ? "Encontrado no índice: " + pos : "Não encontrado.");
                    break;
                case 8:
                    minhaLista.display();
                    break;
                case 9:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        leitor.close();

        minhaLista.display();
    }
}

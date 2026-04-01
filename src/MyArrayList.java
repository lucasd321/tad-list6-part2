public class MyArrayList implements MyArrayListTAD 
{
    private int[] item;
    private int count;

    public MyArrayList(int s) {
        this.item = new int[s];
        this.count = 0;
    }

    // --- Auxiliares ---
    public boolean isFull() {
        return count == item.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    // --- Inserção ---
    public void addLast(int newItem) {
        if (isFull()) {
            System.out.println("Erro: Lista cheia");
            return;
        }
        item[count] = newItem;
        count++;
    }

    public void addFirst(int newInt) {
        insertAt(0, newInt); // Reutiliza a lógica do insertAt
    }

    public void insertAt(int i, int newInt) {
        if (isFull()) {
            System.out.println("Erro: Lista cheia");
            return;
        }
        if (i < 0 || i > count) {
            System.out.println("Erro: Índice inválido");
            return;
        }

        // Deslocamento para a DIREITA (do fim para o início)
        for (int j = count; j > i; j--) {
            item[j] = item[j - 1];
        }
        item[i] = newInt;
        count++;
    }

    public void addSorted(int newInt) {
        if (isFull()) return;
        int pos = 0;
        // Encontra a posição correta (primeiro elemento maior que newInt)
        while (pos < count && item[pos] < newInt) {
            pos++;
        }
        insertAt(pos, newInt);
    }

    // --- Remoção ---
    public void removeLast() {
        if (!isEmpty()) {
            count--; // Basta diminuir o contador
        }
    }

    public void removeFirst() {
        removeAt(0); // Reutiliza a lógica do removeAt
    }

    public void removeAt(int i) {
        if (i < 0 || i >= count) {
            System.out.println("Erro: Índice inválido");
            return;
        }

        // Deslocamento para a ESQUERDA (do início para o fim)
        for (int j = i; j < count - 1; j++) {
            item[j] = item[j + 1];
        }
        count--;
    }

    public void remove(int element) {
        int index = find(element);
        if (index != -1) {
            removeAt(index);
        }
    }

    // --- Busca e Acesso ---
    public int find(int element) {
        for (int i = 0; i < count; i++) {
            if (item[i] == element) {
                return i; // Retorna o índice onde encontrou
            }
        }
        return -1;
    }

    public int get(int i) {
        if (i >= 0 && i < count) {
            return item[i];
        }
        return -1; // Ou lançar exceção
    }

    public void set(int i, int newInt) {
        // Adicionado o parâmetro newInt
        if (i >= 0 && i < count) {
            item[i] = newInt;
        }
    }

    // método display()
    public void display() {
        if (isEmpty()) {
            System.out.println("Lista vazia.");
            return;
        }
        System.out.print("Lista [" + count + "/" + item.length + "]: ");
        for (int i = 0; i < count; i++) {
            System.out.print(item[i] + (i < count - 1 ? ", " : ""));
        }
        System.out.println();
    }
}

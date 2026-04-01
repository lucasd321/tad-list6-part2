public interface MyArrayListTAD {
    void addLast(int newItem);
    void addFirst(int newInt);
    void insertAt(int i, int newInt);
    void addSorted(int newInt);
    void removeLast();
    void removeFirst();
    void remove(int item);
    void removeAt(int i);
    int find(int item);
    int get(int i);
    void set(int i, int newInt);
    boolean isEmpty();
    boolean isFull();
    void display();
}

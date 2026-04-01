# Estrutura de Dados: MyArrayList

Este projeto consiste na implementação de uma lista linear baseada em arrays estáticos em Java. O objetivo é demonstrar o gerenciamento manual de memória e o conceito de **deslocamento de elementos (shifting)** em operações de inserção e remoção.

## 🚀 Funcionalidades

A classe `MyArrayList` implementa o contrato definido na interface `MyArrayListTAD`, oferecendo as seguintes operações:

### Inserção
* **addFirst**: Insere um elemento no início da lista, deslocando todos os outros para a direita.
* **addLast**: Insere um elemento na última posição disponível.
* **insertAt**: Insere um elemento em um índice específico.
* **addSorted**: Insere um elemento mantendo a lista em ordem crescente.

### Remoção
* **removeFirst**: Remove o primeiro elemento e desloca os restantes para a esquerda.
* **removeLast**: Remove o último elemento da lista.
* **removeAt**: Remove o elemento de um índice específico.
* **remove**: Localiza um valor específico e o remove da lista.

### Consulta e Utilidades
* **find**: Retorna o índice de um valor.
* **get/set**: Acessa ou altera o valor em uma posição.
* **isEmpty/isFull**: Verifica o estado de ocupação da lista.
* **display**: Exibe visualmente o conteúdo atual e o total de elementos.

--

#Data Structures: MyArrayList

This project consists of implementing a linear list based on static arrays in Java. The goal is to demonstrate the memory management manual and the concept of **element shifting** in insertion and removal operations.

## 🚀 Features

The `MyArrayList` class implements the contract defined in the `MyArrayListTAD` interface, offering the following transactions:

### Insertion
* **addFirst**: Insert an element at the beginning of the list, shifting all others to the right.

* **addLast**: Insert an element at the last available position.

* **insertAt**: Insert an element at a specific index.

* **addSorted**: Insert an element that keeps the list in ascending order.

### Removal
* **removeFirst**: Remove the first element and shift the remaining elements to the left.

* **removeLast**: Removes the last element from the list.

* **removeAt**: Removes the element from a specific index.

* **remove**: Locates a specific value and removes it from the list.

### Query and Utilities
* **find**: Returns the index of a value.

* **get/set**: Accesses or modifies the value at a given position.

* **isEmpty/isFull**: Checks the list's full state.

* **display**: Visually displays the current content and the total number of elements.

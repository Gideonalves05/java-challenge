package com.example;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Task here is to write a list. Each element must know the element before and
 * after it. Print out your list and them remove the element in the middle of
 * the list. Print out again.
 *
 */


public class TASK2 {

     public static void main(String[] args) {
        // Cria uma lista duplamente encadeada
        LinkedList<String> doublyLinkedList = new LinkedList();

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número de elementos que ele deseja adicionar
        System.out.print("Quantos elementos você deseja adicionar à lista? ");
        int numberOfElements = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o próximo inteiro

        // Solicita ao usuário que insira os elementos da lista
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            String userInput = scanner.nextLine();
            doublyLinkedList.add(userInput);
        }

        // Imprime a lista original
        System.out.println("Lista original: " + doublyLinkedList);

        // Encontra o elemento do meio
        int middleIndex = doublyLinkedList.size() / 2;

        // Usa um ListIterator para navegar pela lista
        ListIterator<String> iterator = doublyLinkedList.listIterator();

        // Move o iterator para o elemento do meio
        for (int i = 0; i < middleIndex; i++) {
            iterator.next();
        }

        // Remove o elemento do meio
        if (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        // Imprime a lista após a remoção do elemento do meio
        System.out.println("Lista após remover o elemento do meio: " + doublyLinkedList);

        // Fecha o scanner
        scanner.close();
    }
}
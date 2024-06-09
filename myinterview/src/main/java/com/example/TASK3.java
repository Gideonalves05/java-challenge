package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * Write a list and add an aleatory number of Strings. In the end, print out how
 * many distinct items exist on the list.
 *
 */
public class TASK3 {

    public static void main(String[] args) {
        // Cria uma lista para armazenar strings
        List<String> stringList = new ArrayList();

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número de strings que ele deseja adicionar
        System.out.print("Quantas strings você deseja adicionar à lista? ");
        int numberOfStrings = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o próximo inteiro

        // Solicita ao usuário que insira as strings
        for (int i = 0; i < numberOfStrings; i++) {
            System.out.print("Digite a string " + (i + 1) + ": ");
            String userInput = scanner.nextLine();
            stringList.add(userInput);
        }

        // Imprime a lista de strings
        System.out.println("Lista de strings: " + stringList);

        // Usa um HashSet para encontrar o número de itens distintos
        Set<String> distinctItems = new HashSet();

        // Usa um iterator para percorrer a lista
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            distinctItems.add(item);
        }

        // Imprime o número de itens distintos
        System.out.println("Número de itens distintos: " + distinctItems.size());

        // Fecha o scanner
        scanner.close();
    }
}

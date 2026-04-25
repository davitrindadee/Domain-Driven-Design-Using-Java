package br.com.fiap.apostila07.view;

import java.util.Scanner;

public class TesteElevadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        double altura1, altura2;
        double peso1, peso2;

        // Pessoa 1
        System.out.print("Nome da pessoa 1: ");
        nome1 = sc.nextLine();
        System.out.print("Altura da pessoa 1: ");
        altura1 = sc.nextDouble();
        System.out.print("Peso da pessoa 1: ");
        peso1 = sc.nextDouble();
        sc.nextLine(); // limpar buffer

        // Pessoa 2
        System.out.print("\nNome da pessoa 2: ");
        nome2 = sc.nextLine();
        System.out.print("Altura da pessoa 2: ");
        altura2 = sc.nextDouble();
        System.out.print("Peso da pessoa 2: ");
        peso2 = sc.nextDouble();

        // Mais pesado
        if (peso1 > peso2) {
            System.out.println("\nMais pesado: " + nome1);
        } else {
            System.out.println("\nMais pesado: " + nome2);
        }

        // Mais alto
        if (altura1 > altura2) {
            System.out.println("Mais alto: " + nome1);
        } else {
            System.out.println("Mais alto: " + nome2);
        }

        sc.close();
    }
}
package br.com.fiap.apostila07.view;

import java.util.Scanner;

public class TesteTamanho {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Dados da pessoa 1
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();

        System.out.print("Digite a altura da primeira pessoa: ");
        double altura1 = sc.nextDouble();

        System.out.print("Digite o peso da primeira pessoa: ");
        double peso1 = sc.nextDouble();
        sc.nextLine(); // limpar buffer

        // Dados da pessoa 2
        System.out.print("\nDigite o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();

        System.out.print("Digite a altura da segunda pessoa: ");
        double altura2 = sc.nextDouble();

        System.out.print("Digite o peso da segunda pessoa: ");
        double peso2 = sc.nextDouble();

        // Verificar mais pesado
        String maisPesado;
        if (peso1 > peso2) {
            maisPesado = nome1;
        } else {
            maisPesado = nome2;
        }

        // Verificar mais alto
        String maisAlto;
        if (altura1 > altura2) {
            maisAlto = nome1;
        } else {
            maisAlto = nome2;
        }

        // Resultado
        System.out.println("\nPessoa mais pesada: " + maisPesado);
        System.out.println("Pessoa mais alta: " + maisAlto);

        sc.close();
    }//main
}//class
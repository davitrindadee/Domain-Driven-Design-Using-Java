package br.com.fiap.apostila07.view;

import java.util.Scanner;

public class TesteEleitores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade;
        int totalObrigatorio = 0;

        for (int i = 0; i < 3; i++) {

            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idade = sc.nextInt();

            if (idade < 16) {
                System.out.println("Classificação: Não eleitor");

            } else if ((idade >= 18) && (idade <= 65)) {
                System.out.println("Classificação: Eleitor obrigatório");
                totalObrigatorio++;

            } else {
                System.out.println("Classificação: Eleitor facultativo");
            }

            System.out.println(); // espaço
        }

        System.out.println("Total de eleitores obrigatórios: " + totalObrigatorio);

        sc.close();
        // Caso eu crie uma variavél com o mesmo nome ela que ser dentro do FOR, caso eu queira criar outra minha variavél é obrigatória ter outro nome
    }
}
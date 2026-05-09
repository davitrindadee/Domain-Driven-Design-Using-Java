package br.com.fiap.portal.view;

import br.com.fiap.portalgeral.model.Aluno;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // CRIANDO O OBJETO ALUNO
        Aluno aluno = new Aluno();

        // LENDO OS DADOS DO USUARIO
        System.out.println("CADASTRO DO ALUNO ");

        System.out.print("Digite o nome: ");
        aluno.setNome(scanner.nextLine());

        System.out.print("Digite o CPF: ");
        aluno.setCpf(scanner.nextLine());

        System.out.print("Digite a idade: ");
        aluno.setIdade(scanner.nextInt());

        System.out.print("Digite o RM: ");
        aluno.setRm(scanner.nextInt());

        scanner.nextLine(); // limpar buffer

        System.out.print("Digite a turma: ");
        aluno.setTurma(scanner.nextLine());

        // EXIBINDO DADOS DO ALUNO
        System.out.println("\n DADOS DO ALUNO ");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("RM: " + aluno.getRm());
        System.out.println("Turma: " + aluno.getTurma());

        scanner.close();
    }
}
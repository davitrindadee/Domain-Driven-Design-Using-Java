package br.com.fiap.portal.view;

import br.com.fiap.portalgeral.model.Aluno;
import br.com.fiap.portalgeral.model.Endereco;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criando os objetos
        Aluno aluno = new Aluno();
        Endereco endereco = new Endereco();

        // Lendo os dados do aluno
        System.out.println("===== CADASTRO DO ALUNO =====");

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

        // Lendo os dados do endereço
        System.out.println("\n===== ENDEREÇO =====");

        System.out.print("Digite o logradouro: ");
        endereco.setLogradouro(scanner.nextLine());

        System.out.print("Digite o complemento: ");
        endereco.setComplemento(scanner.nextLine());

        // Associando o endereço ao aluno
        aluno.setEndereco(endereco);

        // Exibindo os dados
        System.out.println("\n===== DADOS DO ALUNO =====");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("RM: " + aluno.getRm());
        System.out.println("Turma: " + aluno.getTurma());

        System.out.println("\n===== ENDEREÇO DO ALUNO =====");
        System.out.println("Logradouro: " + aluno.getEndereco().getLogradouro());
        System.out.println("Complemento: " + aluno.getEndereco().getComplemento());

        scanner.close();
    }
}
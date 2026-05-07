package br.com.fiap.apostila08.view;

import javax.swing.*;

public class TesteString2 {

    public static void main(String[] args) {

        String email = JOptionPane.showInputDialog("Digite o email");

        // Validar se é um e-mail válido
        if (email.contains("@") && email.contains(".")) {

            JOptionPane.showMessageDialog(null, "E-mail válido!");

            // Exibir o nome antes do @
            String email = JOptionPane.showInputDialog("Digite seu email");

            //Exibir o email sem domínio (davi@fiap.com.br)
            int arroba = email.indexOf("@");
            int finalEmail = email.length();

            String emailSemDominio = email.substring(0,arroba);
            System.out.println(emailSemDominio);


            //Exibir o domínio
            String dominio = email.substring(arroba+1,finalEmail);
            System.out.println(dominio);

        }
    }
}
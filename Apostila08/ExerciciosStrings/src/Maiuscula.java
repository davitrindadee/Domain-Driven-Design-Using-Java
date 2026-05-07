import javax.swing.*;

public class Maiuscula {

    public static void main(String[] args) {

        String palavra = JOptionPane.showInputDialog("Digite uma palavra");

        // Converter para maiúsculo (toUpperCase)
        palavra = palavra.toUpperCase();

        JOptionPane.showMessageDialog(null, palavra);
    }
}
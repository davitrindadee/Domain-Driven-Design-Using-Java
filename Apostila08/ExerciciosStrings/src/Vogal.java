import javax.swing.*;

public class Vogal {

    public static void main(String[] args) {

        // Solicitar uma palavra
        String texto = JOptionPane.showInputDialog("Digite uma palavra");

        // Converter para minúsculo
        texto = texto.toLowerCase();

        String resultado = "";

        // Laço de repetição
        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            // Verificar se é vogal
            if (letra == 'a' || letra == 'e' || letra == 'i'
                    || letra == 'o' || letra == 'u') {

                resultado += "*";

            } else {

                resultado += letra;
            }
        }

        // Exibir resultado
        JOptionPane.showMessageDialog(null, resultado);
    }
}
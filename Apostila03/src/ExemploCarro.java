public class ExemploCarro {

public static void main(String[] agrs) {
    //Criar um objeto do tipo Carro
    Carro gol = new Carro();
    gol.cor = "Prata";
    gol.velocidadeMaxima = 120;
    gol.ano = 2010;
    gol.modelo = "quadrado";
    gol.automatico = false; //true (verdadeiro), false (falso)
    gol.peso = 600;
    gol.altura = 1.5f; //f no final para definir que o valor é float


    //Exibir os valores dos atributos do objeto
    System.out.println("Modelo: " + gol.modelo); //sout
    System.out.println("Ano: " + gol.ano);
    System.out.println("Cor: " + gol.cor);
    System.out.println("Peso: " + gol.peso);
    System.out.println("Altura: " + gol.altura);
    System.out.println("VelocidadeMaxima: " + gol.velocidadeMaxima);
    System.out.println("Automatico: " + gol.automatico);

    //Criar um novo atributo para o objeto carro

    //Colocar valores para 2 atributos e exibir esses valores

    //Objeto carro 2
    Carro nivus = new Carro();
    nivus.cor = "Cinza";
    nivus.velocidadeMaxima = 300;
    nivus.ano = 2026;
    nivus.modelo = "Tsi";
    nivus.automatico = true; //true (verdadeiro), false (falso)
    nivus.peso = 1238;
    nivus.altura = 1493;

    //Exibir valor dos atributos
    System.out.println("Cor: " + nivus.cor); //sout
    System.out.println("VelocidadeMaxima: " + nivus.velocidadeMaxima);
    System.out.println("Ano: " + nivus.ano);
    System.out.println("Modelo: " + nivus.modelo);
    System.out.println("Automatico: " + nivus.automatico);
    System.out.println("Peso: " + nivus.peso);
    System.out.println("Altura: " + nivus.altura);
}

}

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        SomTrovao somtrovao = new SomTrovao();

        somtrovao.calcularDistancia();

        double intervalo = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o intervalo: "));

        somtrovao.setIntervalo(intervalo);

        JOptionPane.showMessageDialog(null, "A distância aproximadamente é: " + somtrovao.calcularDistancia());

        JOptionPane.showMessageDialog(null, "A distância aproximadamente em metros é: " + somtrovao.convercaoMetro());



        Pessoa p = new Pessoa();
        String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome: ");
        p.setNome(nome);

        JOptionPane.showMessageDialog(null, p.verificarNome(), "Senai Tagua", JOptionPane.INFORMATION_MESSAGE);

    }
}
/* 
 *##Desafio Java
 * Criar um programa que calcula a que distância, em pés, um ouvinte está da queda de um relâmpago.
 * O som viaja a aproximadamente 1.100 pés por segundo pelo ar.
 * Logo, conhecer o intervalo entre o momento em que você ouviu o relâmpago e o momento em que o som o alcançou lhe permitirá calcular a distância do relâmpago.
 * Para este projeto, considere que o intervalo seja de 7.2 segundos.
 * 
 * ##Interface Gráfica
 * 
 * Utilizaremos o pacote swing:
 * 
 * - import javax.swing.*;
 * 
 * ##Gerar um javadoc
 * 
 * Recurso utilizado por programadores profissionais para gerar uma documentação das classes. 
 * Utilize CTRL+SHIFT+P e encontre a opção para gerar um JavaDoc
 * 
 * ## Gerar um file .jar
 * 
 * Extensão utilizada:
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.println("Digite a quantidade de Galões");
        conversor.galoes = scan.nextDouble();

        conversor.info();

        scan.close();
    }
}

/*
 * Crie um projeto que converta galões em litros.O programa funcionará declarando  
 * duas variáveis double. Uma conterá o número de galões e a outra o número de litros * após a conversão.
 * Um galão é equivalente a 3,7854 litros. Logo, na conversão de galões em litros, o  * valor do galão é multiplicado por 3,7854.
 * O programa exibe tanto o número de galões quanto o número equivalente em litros.
 */
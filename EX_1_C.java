
import java.util.Scanner;

/**
* Unicesumar Centro Universitário Cesumar
* Curso: Análise e Desenvolvimento de Sistemas
* Autor: João Victor de Brito Martins
* Data: 21/11/2016
* Repositório: (coloque o link para o repositório no GitHub)
* Descrição: (Ler uma temperatura em graus Fahrenheit e apresenta-la convertida em graus Celsius. A
fórmula de conversão a ser utilizada é C = (( F – 32 ) * 5) / 9, em que a variável F representa a
temperatura em graus Fahrenheit e a variável C a temperatura em graus Celsius)
*/

public class EX1C {

    static double conversao(double f) {

        return (f - 32) / 1.8;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor em Fahrenheit: ");
        double c = leitor.nextInt();

        System.out.println("O número convertido em Celsius é: ");
        System.out.println(conversao(c));
    }

}


import java.util.Scanner;

/**
* Unicesumar Centro Universitário Cesumar
* Curso: Análise e Desenvolvimento de Sistemas
* Autor: João Victor de Brito Martins
* Data: 21/11/2016
* Repositório: (coloque o link para o repositório no GitHub)
* Descrição: (Ler uma temperatura em graus Celsius e exibi-la convertida em graus Fahrenheit. A fórmula de
conversão a ser utilizada é F = ( 9 * C + 160 ) / 5, em que a variável F representa a temperatura
em graus Fahrenheit e a variável C a temperatura em graus Celsius)
*/
public class EX1B {

    static double conversao(double c) {
        return (9 * c + 160) / 5;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor em Celsius: ");
        double celsius = leitor.nextInt();
        System.out.println("O número convertido em Fahrenheit é: ");
        System.out.println(conversao(celsius));
    }

}

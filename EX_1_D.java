
import java.util.Scanner;

/**
* Unicesumar Centro Universitário Cesumar
* Curso: Análise e Desenvolvimento de Sistemas
* Autor: João Victor de Brito Martins
* Data: 21/11/2016
* Repositório: (coloque o link para o repositório no GitHub)
* Descrição: (Ler uma temperatura em graus Celsius e apresenta-la convertida em graus Kelvin. A fórmula
para conversão é K = C + 273.15, onde K é a temperatura em Kelvin e C é a temperatura em
graus Celsius.)
*/

public class EX1D {

    static double conversao(double c) {
        return c + 273.15;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor em Celsius: ");
        double k = leitor.nextInt();
        System.out.println("O número convertido em Kelvin é: ");
        System.out.println(conversao(k));
    }

}

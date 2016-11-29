
import java.util.Scanner;

/**
* Unicesumar Centro Universitário Cesumar
* Curso: Análise e Desenvolvimento de Sistemas
* Autor: João Victor de Brito Martins
* Data: 21/11/2016
* Repositório: (coloque o link para o repositório no GitHub)
* Descrição: (Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em Kelvin. Para
conversão deve-se primeiro converter em graus Celsius conforme exercício anterior, e depois
converter em Kelvin.)
*/

public class EX1E {

    static double conversaoFahrenheitCelsius(double f) {

        return (f - 32) / 1.8;
    }

    static double conversaoCelsiusKelvin(double k) {
        return k + 273.15;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor em Fahrenheit: ");
        double x = leitor.nextInt();
        double fahrenheit =  conversaoFahrenheitCelsius(x);
        double kelvin = fahrenheit;
        System.out.println("O número convertido em Kelvin é: ");
        System.out.println(conversaoCelsiusKelvin(kelvin));
    }

}
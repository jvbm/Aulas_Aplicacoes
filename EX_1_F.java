import java.util.Scanner;

/**
* Unicesumar Centro Universitário Cesumar
* Curso: Análise e Desenvolvimento de Sistemas
* Autor: João Victor de Brito Martins
* Data: 21/11/2016
* Repositório: (coloque o link para o repositório no GitHub)
* Descrição: (Calcular e apresentar o valor do volume de um galão, utilizando a fórmula
V = pi * (r * r) *A, onde: pi = 3.141592653589793, ?r é o raio e ?A é a área. Tanto o raio quanto
a área são dados de entrada do programa.)
*/

public class EX1F {

    static double volume(double area, double raio) {
        double pi = 3.141592653589793;
        return pi * (raio * raio) * area;
    }

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor do raio: ");
        double raio = leitor.nextInt();
        System.out.println("Digite um valor da area: ");
        double area = leitor.nextInt();
        System.out.println("O valor do volume é: ");
        System.out.println(volume(area, raio));
    }

}
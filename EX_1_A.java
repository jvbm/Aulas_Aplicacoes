
import java.util.Scanner;

/**
* Unicesumar Centro Universitário Cesumar
* Curso: Análise e Desenvolvimento de Sistemas
* Autor: João Victor de Brito Martins
* Data: 21/11/2016
* Repositório: (coloque o link para o repositório no GitHub)
* Descrição: (Calcule a quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel
que faz 12 km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem
e a velocidade média. Desta forma, será possível obter a distância percorrida com a fórmula
DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de
litros de combustível utilizada na viagem com a fórmula LITROS_USADOS = DISTANCIA / 12. O
programa deve apresentar os valores da velocidade média, tempo gasto, distância percorrida e
quantidade de litros utilizada na viagem.
*/

public class EX1A {

    public static void main(String[] args) {

        float tempoGasto;
        float velocidadeMedia;
        float distancia;
        float litrosUsados;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tempo médio da viagem: ");
        tempoGasto = leitor.nextInt();
        System.out.println("Digite a média de velocidade: ");
        velocidadeMedia = leitor.nextInt();

        distancia = tempoGasto * velocidadeMedia;
        litrosUsados = distancia / 12;

        System.out.println("A velocidade média é: " + tempoGasto + "km/h.");
        System.out.println("O tempo gasto foi " + velocidadeMedia + " hora(s).");
        System.out.println("A distância percorrida foi: " + distancia + "km's");
        System.out.println("A quantidade de litros utilizada na viagem foi: " + litrosUsados + " litros.");
    }
}

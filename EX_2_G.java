import java.util.Scanner;


/**
* Unicesumar Centro Universitário Cesumar
* Curso: Análise e Desenvolvimento de Sistemas
* Autor: João Victor de Brito Martins
* Data: 22/11/2016
* Repositório: (coloque o link para o repositório no GitHub)
* Descrição: (Ler um valor inteiro e verifique se o valor está entre 1 e 9 (inclusive). O programa deve indicar
com a mensagem “O valor está na faixa permitida” caso esteja dentro da faixa e indicar com a
mensagem “O valor está fora da faixa permitida” caso esteja fora da faixa.)
*/

public class EX2G
{
  static public void main(String[] args)
  {

    Scanner s = new Scanner(System.in);

    System.out.println("Digite um numero inteiro: ");
    int num = s.nextInt();

    if((num >= 1) && (num <= 9)){
      System.out.println("O valor esta na faixa permitida");
    }else{
      System.out.println("O valor esta fora da faixa permitida");
    }
  }
}
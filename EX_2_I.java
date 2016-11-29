/**
* Unicesumar Centro Universitário Cesumar
* Curso: Análise e Desenvolvimento de Sistemas
* Autor: João Victor de Brito Martins
* Data: 22/11/2016
* Repositório: (coloque o link para o repositório no GitHub)
* Descrição: (Ler um valor inteiro qualquer e apresentar mensagem informando se o valor é par ou ímpar.)
import java.util.Scanner;
public class EX2I
{
  static public void main(String[] args)
  {
    Scanner s = new Scanner(System.in);

    int num;

    System.out.println("Digite um numero inteiro: ");
    num = s.nextInt();

    if(num % 2 != 0){
      System.out.print("O numero " + num + " e IMPAR!\n");
    }else{
      System.out.print("O numero " + num + " e PAR!\n");
    }
  }
}
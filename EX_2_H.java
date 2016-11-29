/**
* Unicesumar Centro Universitário Cesumar
* Curso: Análise e Desenvolvimento de Sistemas
* Autor: João Victor de Brito Martins
* Data: 22/11/2016
* Repositório: (coloque o link para o repositório no GitHub)
* Descrição: (Ler cinco valores inteiros e apresentar o maior e o menor valores informados.)*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class EX2H
{
  static public void main(String[] args)
  {
  
    Scanner s = new Scanner(System.in);

    int vet_num[];
    vet_num = new int[5];
    int maior, menor;

    for(int i = 0; i < 5; i++){
      System.out.print("Digite o numero: \n");
      vet_num[i] = s.nextInt();
    }

    Arrays.sort(vet_num);
    menor = vet_num[0];
    maior = vet_num[4];
    System.out.print("O menor numero digitado foi " + menor + "\n");
    System.out.print("O maior numero digitado foi " + maior + "\n");
  }
}
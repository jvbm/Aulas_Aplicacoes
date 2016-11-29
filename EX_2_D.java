import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

/**
* Unicesumar Centro Universitário Cesumar
* Curso: Análise e Desenvolvimento de Sistemas
* Autor: João Victor de Brito Martins
* Data: 21/11/2016
* Repositório: (coloque o link para o repositório no GitHub)
* Descrição: (Ler três valores inteiros e apresenta-los em ordem crescente)
*/

public class EX2D
{
  static public void main(String[] args)
  {
   
    Scanner s = new Scanner(System.in);

    int vet_num[];
    vet_num = new int[3];

    for(int i = 0; i < 3; i++){
      System.out.print("Digite um número. \n");
      vet_num[i] = s.nextInt();
    }
	
    Arrays.sort(vet_num);
    for(int i = 0; i < 3; i++){
      System.out.print("Numeros em ordem crescente: \n");
      System.out.print(vet_num[i] + "\n");
    }

  }
}
import java.util.Scanner;

/**
* Unicesumar Centro Universitário Cesumar
* Curso: Análise e Desenvolvimento de Sistemas
* Autor: João Victor de Brito Martins
* Data: 21/11/2016
* Repositório: (coloque o link para o repositório no GitHub)
* Descrição: (Ler três valores inteiros e apresenta-los em ordem crescente)
*/

public class EX2F
{
  static public void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
	
    int aux;
    int vet_num[];
    vet_num = new int[4];

    for(int i = 0; i < 4; i++){
      System.out.print("Digite um numero. \n");
      vet_num[i] = s.nextInt();
    }

    for(int i = 0; i < 4; i++){
      aux = vet_num[i];
      if((aux % 2 == 0) && (aux % 3 == 0)){
        System.out.print("O numero " + vet_num[i] + " pode é divisivel por 2 e 3\n");
      }
    }

  }
}
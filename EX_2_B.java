import java.util.Scanner;

/**
* Unicesumar Centro Universitário Cesumar
* Curso: Análise e Desenvolvimento de Sistemas
* Autor: João Victor de Brito Martins
* Data: 21/11/2016
* Repositório: (coloque o link para o repositório no GitHub)
* Descrição: (Ler um valor inteiro qualquer positivo ou negativo e apresentar o número lido como um valor
positivo)
*/

public class EX2B {
    
    public static void main(String[] args) {
        double a;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        a = leitor.nextInt();
      if(a >=0){
          System.out.println(a);
      }
      else{
          System.out.println(a * -1);
      }
    }
   }

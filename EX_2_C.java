import java.util.Scanner;

/**
* Unicesumar Centro Universitário Cesumar
* Curso: Análise e Desenvolvimento de Sistemas
* Autor: João Victor de Brito Martins
* Data: 21/11/2016
* Repositório: (coloque o link para o repositório no GitHub)
* Descrição: (Ler quatro valores reais referentes a quatro notas escolares de um aluno e apresentar uma
mensagem informando se o aluno foi aprovado ou reprovado. Para determinar a aprovação do
aluno considere a média escolar maior ou igual a 6. Apresentar junto com as mensagens o
valor da média do aluno.)
*/

public class EX2C {
    
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int media;
        
       Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o valor A: ");
        a = leitor.nextInt();
        System.out.println("Insira o valor B:  ");
        b = leitor.nextInt();
        System.out.println("Insira o valor C:  ");
        c = leitor.nextInt();
        System.out.println("Insira o valor D:  ");
        d = leitor.nextInt();
        
        media = (a + b + c + d)/ 4;
        
        System.out.println ("A média do aluno foi " + media + ".");
        if(media >= 6 && media < 11){
            System.out.println("Aluno Aprovado");
        }
        else if (media >= 0 && media < 6){
            System.out.println("Aluno reprovado");
        }
        else{
            System.out.println("Houve algum erro na entrada das notas.");
        }
    }
   }

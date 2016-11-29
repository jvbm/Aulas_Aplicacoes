import java.util.Scanner;

/**
* Unicesumar Centro Universitário Cesumar
* Curso: Análise e Desenvolvimento de Sistemas
* Autor: João Victor de Brito Martins
* Data: 21/11/2016
* Repositório: (coloque o link para o repositório no GitHub)
* Descrição: (Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior valor em
relação ao menor valor.)
*/

public class EX2A {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o valor A: ");
        a = leitor.nextInt();
        System.out.println("Insira o valor B:  ");
        b = leitor.nextInt();
        
        if(a > b){
            System.out.print("A diferença de " + a );
            System.out.print(" para " + b + " é: " + (a - b)+ ".\n");
        }
        else if(b > a){
            System.out.print("A diferença de " + b );
            System.out.print(" para " + a + " é: " + (b - a) + ".\n");
        }
        else{
            System.out.println("Os dois valores são iguais, não existe diferença entre eles.");
        }
            
        for(int contador = 0;contador <a;contador++){
            
        }
    }

}
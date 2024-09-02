
// Questão 2
    /*
        2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
    */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question2 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        List<Integer> fibonnaciSeq = new ArrayList<>();

        System.out.println("Digite um número");
        Integer n = sc.nextInt();

        Integer k = 1;
        Integer i = 0;

        fibonnaciSeq.add(0);
        fibonnaciSeq.add(1);


        while(true){
            int next = k + i;
            if (next > n ) break;
            fibonnaciSeq.add(next);
            i = k;
            k = next;
        }

        if(fibonnaciSeq.contains(n)){
            System.out.println("O número pertence a sequência");
        }else{
            System.out.println("O número não pertence a sequência");
        }

        sc.close();



    }

}

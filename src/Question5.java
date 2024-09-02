// Questão 5
    /*
        5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
    */


import java.util.Scanner;

public class Question5 {

    public static void main (String[] args){

        System.out.println("Digite a palavra");
        Scanner sc = new Scanner(System.in);
        String normalOrder = sc.next();
        String reversed = "";

        for (int i = normalOrder.length() - 1; i >= 0; i--){
            reversed += normalOrder.charAt(i);
        }

        System.out.println(reversed);

        sc.close();

    }




}

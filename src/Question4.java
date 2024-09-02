
// Questão 4
    /*
        4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
• SP – R$67.836,43
• RJ – R$36.678,66
• MG – R$29.229,88
• ES – R$27.165,48
• Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
    */


import java.util.Scanner;

public class Question4 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o faturamento de SP:");
        Double fatSP = sc.nextDouble();

        System.out.println("Digite o faturamento de RJ:");
        Double fatRJ = sc.nextDouble();

        System.out.println("Digite o faturamento de MG:");
        Double fatMG = sc.nextDouble();

        System.out.println("Digite o faturamento de ES:");
        Double fatES = sc.nextDouble();

        System.out.println("Digite o faturamento de Outros:");
        Double fatOutros = sc.nextDouble();

        Double soma = fatSP + fatES + fatRJ + fatMG + fatOutros;

        Double pctSP = fatSP/soma*100;

        Double pctRJ = fatSP/soma*100;

        Double pctMG = fatSP/soma*100;

        Double pctES = fatSP/soma*100;

        Double pctOutros = fatSP/soma*100;


        System.out.println("O percentual de representação de cada estado é :" +
                " SP: " + pctSP + "%" +
                " RJ: " + pctRJ + "%" +
                " MG: " + pctMG + "%" +
                " ES: " + pctES + "%" +
                "Outros: " + pctOutros + "%");
    }
}

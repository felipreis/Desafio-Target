




public class Question1 {

    public static void main(String[] args) {
        // Questão 1
    /*
        1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
        Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
        Imprimir(SOMA);
        Ao final do processamento, qual será o valor da variável SOMA?
    */

        Integer indice = 13;
        Integer soma = 0;
        Integer k = 0;
        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println(soma);

    }
}
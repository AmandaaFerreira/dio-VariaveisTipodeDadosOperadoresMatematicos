package dio.variaveis;

//Classes de exemplo, exercicio da aula I sobre variáveis.//

public class TipoVariaveis {
    public static void main(String[] args) {

        //Exemplos positivos//
        int i = 7; //Em laços de repetição é uma boa opção//
        int I = 6;
        I = 10;
        int quantidadeProduto = 43;
        int NUMERO_TENTATIVAS = 1;
        //int final NUMERO_TENTATIVAS = 1;//

        //Positivo porém, não é indicado usar - má prática//
        int _1a;
        int $aq;
        _1a = 20;
        $aq = 7;
        int qtdProd; //nome não expressivo, de dificil interpetração//
        final int j = 18;
        int abcd1234ef = 12;
        int QuantidadeProduto = 10;

       /* Exemplos negativos
        int 1;
        int 1a;
        1 = 5;
        int abcd123 45ef;
        int abcd123%45_ef=67;
        int abcd1$234%56_md=78;
        int final numeroTentativas = 1;
        int i;
        j = 15;
        */

        System.out.println(i);
        System.out.println(I);
        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(j);
        System.out.println(abcd1234ef);
        System.out.println(QuantidadeProduto);

    }
}

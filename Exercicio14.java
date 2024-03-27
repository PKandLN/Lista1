public class Exercicio14 {

    public static void executar(){

        int a1 = Prompt.lerInteiro("Digite o primeiro termo (a1): ");
        int r = Prompt.lerInteiro("Digite a razão (r): ");
        int n = Prompt.lerInteiro("Digite o valor de n: ");
        

        int an = a1 + (n - 1) * r;

        Prompt.imprimir("Resultado: an = " + an);
    }
    }



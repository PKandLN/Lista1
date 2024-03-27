public class Exercicio4 {

    public static void executar(){

        int a = Prompt.lerInteiro("digite um numero");
        int b = Prompt.lerInteiro("digite outro numero");


        int soma = a + b;
        int subtracao = a - b;
        int mutiplicacao = a * b;
        int divisao = a / b;

        Prompt.imprimir("a soma é: " + soma);
        Prompt.imprimir("a subtracao é: " + subtracao);
        Prompt.imprimir("a mulplicacao é: " + mutiplicacao);
        Prompt.imprimir("a divisao é: " + divisao);

        


    
    }

}

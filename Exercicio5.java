public class Exercicio5 {

    public static void executar(){

        int a = Prompt.lerInteiro("digite um numero: ");
        int b = Prompt.lerInteiro("digite outro numero: ");

        Prompt.imprimir("a variavel A: " + b);
        Prompt.imprimir("a variavel B é: " + a);

        Prompt.linhaEmBranco();

        Prompt.imprimir("variavel A original: " + a);
        Prompt.imprimir("variavel B original: " + b);
    }
}

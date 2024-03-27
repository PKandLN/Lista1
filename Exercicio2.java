public class Exercicio2 {

    public static void executar(){

        int numero = Prompt.lerInteiro("Digite um numero: ");
        
        int numero2 = Prompt.lerInteiro("Digite outro numero: ");

        int soma = numero + numero2;

        Prompt.imprimir("o resultado é: " + soma);
    }

}

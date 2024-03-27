public class Exercicio8 {

    public static void executar(){

        int numero = Prompt.lerInteiro("Digite um numero: ");

        if (numero >= 50) {

            Prompt.imprimir("O numero é maior ou igual a 50");
            Prompt.linhaEmBranco();


            
        }else{
            Prompt.imprimir("O numero é menor que 50");
        }
    }
}

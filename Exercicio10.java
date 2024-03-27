public class Exercicio10 {

    public static void executar(){

        int numero = Prompt.lerInteiro("Digite um numero de 1 a 5: ");

        if (numero < 1 || numero > 5) {

            Prompt.imprimir("Numero invalido");
            
        }
    }

}

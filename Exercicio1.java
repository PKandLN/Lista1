

public class Exercicio1 {

    public static void executar() {
        
        int numero = Prompt.lerInteiro("Digite um numero:");
        

        if (numero >10 ) {
            Prompt.imprimir("o numero é maior que 10");

        }else{
            Prompt.imprimir("o numero é menor que 10");
        }
    }

}

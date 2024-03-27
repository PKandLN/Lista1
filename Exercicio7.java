public class Exercicio7 {
    

    public static void executar(){

        int numero = Prompt.lerInteiro("Digite um numero: ");

        if (numero > 100 || numero < 200) {

            Prompt.imprimir(" o numero esta no intervalo.");
            Prompt.linhaEmBranco();

            
            
        }else{

            Prompt.imprimir("Esse numero esta fora do intervalo");
        }
    }

}

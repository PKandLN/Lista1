public class Exercicio6 {

    public static void executar(){

        int C = Prompt.lerInteiro("Digite o grau celcius: ");

        int conversao = (9 * C + 160) / 5;


        Prompt.imprimir("em Fahrenheit fica: " + conversao);
    }
}

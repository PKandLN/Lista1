public class Exercicio9 {

    public static void executar(){

    int a = Prompt.lerInteiro("Digite um numero: ");
    int b = Prompt.lerInteiro("Digite outro numero: ");

    if (a == b) {

        Prompt.imprimir("As variaveis sao iguais");
        Prompt.linhaEmBranco();
        
    }else{
        Prompt.imprimir("As variaveis sao diferentes");;
    }
    }
}

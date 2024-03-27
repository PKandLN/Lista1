public class Exercicio11 {
    public static void executar(){

        int a = Prompt.lerInteiro("Digite o primeiro numero: ");
        int b = Prompt.lerInteiro("Digite o segundo numero: ");
        int c = Prompt.lerInteiro("Digite o terceiro numero: ");

        int menor, meio, maior;

        if (a < b && a < c) {

            menor = a;
            if (b <= c) {
                meio = b;
                maior = c;
                
            }else{
                meio = c;
                maior = b;
            }
            if (b < a && b < c) {

                menor = b;
                if (a <= c) {
                    meio = a;
                    maior = c;
                    
                }else{
                    meio = c;
                    maior = a;
                }         
            
        }
    }
    if (c < b && c < a) {

        menor = c;
        if (a <= b) {
            meio = a;
            maior = b;
            
        }else{
            meio = b;
            maior = a;
        }
}
Prompt.imprimir("a ordem é: " o);
}

}
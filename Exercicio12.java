public class Exercicio12 {

    public static void executar(){

        int nummes = Prompt.lerInteiro("Digite o numero de um mes: ");

        int janeiro = 1;
        int fevereiro = 2;
        int marco = 3;
        int abril = 4;
        int maio = 5;
        int junho = 6;
        int julho = 7;
        int agosto = 8;
        int setembro = 9;
        int outubro = 10;
        int novembro = 11;
        int dezembro = 12;

        if (nummes == 1) {
            Prompt.imprimir("o mes é janeiro");
            
            
        }else if (nummes == 2) {

            Prompt.imprimir("o mes é fevereiro");
            
        }else if (nummes == 3) {
            Prompt.imprimir("o mes é março");

        }else if (nummes == 4) {
            Prompt.imprimir("o mes é abril");
            
        }else if (nummes == 5) {
            Prompt.imprimir("o mes é maio");
            
        }else if (nummes == 6) {
            Prompt.imprimir("o mes é junho");
            
        }else if (nummes == 7) {
            Prompt.imprimir("o mes é julho");
            
        }else if (nummes == 8) {
            Prompt.imprimir("o mes é agosto");
            
        }else if (nummes == 9) {
            Prompt.imprimir("o mes é setembro");
            
        }else if (nummes == 10) {
            Prompt.imprimir("o mes é outubro");
            
        }else if (nummes == 11) {
            Prompt.imprimir("o mes é novembro");
            
        }else if (nummes == 12) {
            Prompt.imprimir("o mes é dezembro");
            
        }

        if (nummes > 12) {
            Prompt.imprimir("Mes invalido. ");
            
        }
    }
}

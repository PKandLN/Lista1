public class Exercicio16 {

    public static void executar(){

        double nota1 = Prompt.lerDecimal("Digite a primeira nota: ");
        

        double nota2 = Prompt.lerDecimal("Digite a segunda nota: ");
        

        double nota3 = Prompt.lerDecimal("Digite a terceira nota: ");
        

        double media = calcularMedia(nota1, nota2, nota3);

        System.out.printf("Média: %.2f\n", media);
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3.0;
        return media;
    }
    }


public class Exercicio17 {

    public static void executar(){

        Prompt.imprimir("Cálculo da Média Ponderada:");

        double nota1 = Prompt.lerDecimal("Digite a primeira nota: ");
        
        double peso1 = Prompt.lerDecimal("Digite o peso da primeira nota: ");
        
        double nota2 = Prompt.lerDecimal("Digite a segunda nota: ");
        
        double peso2 = Prompt.lerDecimal("Digite o peso da segunda nota: ");

        double nota3 = Prompt.lerDecimal("Digite a terceira nota: ");
        
        double peso3 = Prompt.lerDecimal("Digite o peso da terceira nota: ");

        double mediaPonderada = calcularMediaPonderada(nota1, peso1, nota2, peso2, nota3, peso3);
        
        System.out.println("A média ponderada é: " + mediaPonderada);
        
        
    }
    
    public static double calcularMediaPonderada(double nota1, double peso1, double nota2, double peso2, double nota3, double peso3) {
        double somaPesos = peso1 + peso2 + peso3;
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somaPesos;
        return mediaPonderada;
    }
        

        
    }

   
    





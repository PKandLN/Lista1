public class Exercicio15 {

    public static void executar(){

        double P1 = Prompt.lerDecimal("Digite as coordenadas do primeiro ponto P1:");
        Prompt.imprimir("x1: ");
        
        double x1 = Prompt.lerDecimal("11: ");
        double y1 = Prompt.lerDecimal("y1: ");
        

        double P2 = Prompt.lerDecimal("Digite as coordenadas do segundo ponto P2:");
        Prompt.imprimir("x2: ");

        double x2 = Prompt.lerDecimal();
        Prompt.imprimir("y2: ");
        double y2 = Prompt.lerDecimal();

        double distancia = calcularDistancia(x1, y1, x2, y2);

        System.out.printf("Distância entre os pontos: %.2f\n", distancia);
    }

    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distancia;
    }
    }


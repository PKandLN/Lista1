public class Exercicio20 {

    public static void executar(){

        double tempoViagem = Prompt.lerDecimal("Digite o tempo de viagem (em horas):");
        
        double velocidadeMedia = Prompt.lerDecimal("Digite a velocidade média (em km/h):");
        
        double distancia = calcularDistancia(tempoViagem, velocidadeMedia);
        double quantidadeLitros = calcularQuantidadeLitros(distancia);
        
        Prompt.imprimir("A quantidade de litros de combustível gasta é: " + quantidadeLitros);
        
        
    }
    
    public static double calcularDistancia(double tempoViagem, double velocidadeMedia) {
        return tempoViagem * velocidadeMedia;
    }
    
    public static double calcularQuantidadeLitros(double distancia) {
        return distancia / 12.0; // considerando que o carro faz 12 km por litro
    }

        


    }



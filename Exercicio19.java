public class Exercicio19 {


    public static void executar(){


        double raio = Prompt.lerDecimal("Digite o raio do cilindro:");
        
        
        double altura = Prompt.lerDecimal("Digite a altura do cilindro:");
                
        double volume = calcularVolumeCilindro(raio, altura);
        
        Prompt.imprimir("O volume do cilindro é: " + volume);
        
        
    }
    
    public static double calcularVolumeCilindro(double raio, double altura) {
        double volume = 3.14 * raio * raio * altura;
        return volume;
    }


    }


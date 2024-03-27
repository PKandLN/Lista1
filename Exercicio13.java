

public class Exercicio13 {

    public static void executar(){

        

        double a = Prompt.lerDecimal("Digite o valor de A: ");
        

        double b = Prompt.lerDecimal("Digite o valor de B: ");

        char operador = Prompt.lerCaractere("Digite o operador (+, -, *, /): ");
        

        double resultado;

        switch (operador) {
            case '+':
                resultado = a + b;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = a * b;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
                break;
            default:
                System.out.println("Operador não definido.");
        }
    }
    }



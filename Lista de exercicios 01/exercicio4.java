import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double n1 = entrada.nextDouble();

        System.out.println("Digite outro número: ");
        double n2 = entrada.nextDouble();

        System.out.println("1 - Média entre os dois números.");
        System.out.println("2 - A diferença do maior pelo menor.");
        System.out.println("3 - O produto entre os dois números.");
        System.out.println("Escolher a opção desejada digitando apenas o numero indicado nas opções acima.");
        int num = entrada.nextInt();

        switch (num) {
            case 1:
                double media = (n1+n2)/2;
                System.out.println("A média entre os dois números é: " + media);
                break;
            case 2:
                if (n1>n2) {
                    double dif = n1 - n2;
                    System.out.println("A diferença do maior para o menor é de: " + dif);
                } else {
                    double dif = n2 - n1;
                    System.out.println("A diferença do maior para o menor é de: " + dif);
                }
                break;
            case 3:
                double produto = n1 * n2;
                System.out.println("O produto entre os números é: " + produto);
                break;
        
            default:
                System.out.println("Opção invalida, repita todo o processo novamente.");
                break;
        }

        }
    }



/**
 * exercicio1b
 */
import java.util.Scanner;

public class exercicio1b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio da esfera para descobrir a área: ");
        double raio = entrada.nextDouble();

        double area = 3.14*Math.pow(raio, 2);

        System.out.println("A área da circunferecia é: " + area);
    }
    
}
/**
 * Execicios
 */

import java.util.Scanner;

public class exercicio1a{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double raio = entrada.nextDouble();

        double comprimento = 2*3.14*raio;

        System.out.println("O comprimento da esfera é: " + comprimento);
    }
}
import java.util.Scanner;

public class exercicio1c {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do raio para descobrir o volume da esfera: ");
        double raio = entrada.nextDouble();

        double volume = 0.75*3.14*Math.pow(raio, 3);

        System.out.println("O volume dessa circunferencia é: " + volume);
    }
    
}

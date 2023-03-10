import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa para saber qual seu peso ideial.");
        System.out.println("Você é homem ou mulher(H/M)?");
        char sexo = entrada.next().charAt(0);

        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();

        if (sexo == 'H') {
            double pideal = (72.7 * altura) - 58; 
            System.out.println("Seu peso ideal é: " + pideal);
        }
        else{
            double pidealm = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é: " + pidealm);

        }
    }
}

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota da sua P1: ");
        double p1 = entrada.nextDouble();

        System.out.println("Digite a nota da sua P2: ");
        double p2 = entrada.nextDouble();

        double media = (p1+p2)/2;

        if (media<=3.9) {
            System.out.println("Reprovado");
        }

        if (media > 3.9 && media <= 6.9) {
            System.out.println("Exame");
        }

        if (media > 6.9) {
            System.out.println("Aprovado");
        }
    }
}

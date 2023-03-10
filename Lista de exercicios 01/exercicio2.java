import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da prestação que está em atraso: ");
        double valor = entrada.nextDouble();

        System.out.println("Digite quantos meses está atrasado: ");
        double atraso = entrada.nextDouble();

        double prestacao = valor +(valor*0.02*atraso);

        System.out.println("O valor da sua parcela com juros é de " + prestacao);
    }
}

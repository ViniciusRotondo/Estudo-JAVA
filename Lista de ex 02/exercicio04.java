import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<Double>();
        double nota, soma = 0, media = 0;
        int contador = 0, acimaMedia = 0;

        System.out.print("Digite a nota (ou -1 para encerrar): ");
        nota = entrada.nextDouble();

        while (nota != -1 && contador < 100) {
            System.out.println(nota);
            notas.add(nota);
            soma += nota;
            contador++;

            if (nota > media) {
                acimaMedia++;
            }

            System.out.print("Digite a nota (ou -1 para encerrar): ");
            nota = entrada.nextDouble();
            media = soma / contador;
        }

        System.out.println("Quantidade de valores lidos: " + contador);
        System.out.println("Valores informados:");
        for(double n : notas){
            System.out.println(n);
        }
        System.out.println("Valores inversos: ");
        Collections.reverse(notas);
            for(double n : notas){
                System.out.println(n);
        }

        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + media);
        System.out.println("Quantidade de valores acima da média: " + acimaMedia);
    }
}


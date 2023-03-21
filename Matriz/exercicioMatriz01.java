import java.util.Scanner;

public class exercicioMatriz01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m1[][] = new int[3][5];
        int i, j, soma = 0;

        for(i = 0; i < m1.length; i++){
            for(j = 0; j < m1[i].length; j++){
                System.out.println("Informe os elementos na posição " + (i) + " - " + (j) +": ");
                m1[i][j] = entrada.nextInt();

                soma += m1[i][j];

            }
        }
            System.out.println("A soma de todos os elementos da matriz é: " + soma);

    }
}
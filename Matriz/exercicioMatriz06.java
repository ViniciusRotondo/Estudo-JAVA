import java.util.Scanner;

public class exercicioMatriz06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m[][] = new int[3][3];
        int i, j = 0;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        int soma = 0;
        int linha02 = 0;
        int linha03 = 0;
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.println("Informe 9 números para a matriz: ");
                m[i][j] = entrada.nextInt();
            }
        }

        for(i=0; i<3; i++) {
            somaDiagonalPrincipal += m[i][i];
            somaDiagonalSecundaria += m[i][2-i];
        }

        System.out.println("");

        for (i = 0; i < m.length; i++) {
                soma = 0;
            for (j = 0; j < m[i].length; j++) {
                soma += m[i][j];
            }
            System.out.println("A soma da " + (i+1) + "ª linha é de: " + soma);
        }
            System.out.println("");

        for (j = 0; j < m.length; j++) {
            soma = 0;
        for (i = 0; i < m[j].length; i++) {
            soma += m[i][j];
        }
        System.out.println("A soma da " + (j+1) + "ª coluna é de: " + soma);
    }

    System.out.println("");

        System.out.println("A soma da diagonal PRINCIPAL é de: " + somaDiagonalPrincipal);
        System.out.println("A soma da diagonal SECUNDÁRIA é de: " + somaDiagonalSecundaria);
    }
}

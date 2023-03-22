import java.util.Scanner;

public class exercicioMatriz08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m[][] = new int[4][4];
        int m1[][] = new int[4][4];
        int mSoma[][] = new int[4][4];
        int i, j = 0;

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.println("Informe os números da 1º matriz: ");
                m[i][j] = entrada.nextInt();
            }
        }

        for (i = 0; i < m1.length; i++) {
            for (j = 0; j < m1[i].length; j++) {
                System.out.println("Informe os números da 2º matriz: ");
                m1[i][j] = entrada.nextInt();
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                mSoma[i][j] = m[i][j] + m1[i][j];
            }
        }

        System.out.println("1º Matriz: ");
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.println(m[i][j] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("2º Matriz: ");
        for (i = 0; i < m1.length; i++) {
            for (j = 0; j < m1[i].length; j++) {
                System.out.println(m1[i][j] + " ");
            }
        }

        System.out.println(" ");
        System.out.println("Soma da 1º Matriz + 2º Matriz: ");
        for (i = 0; i < mSoma.length; i++) {
            for (j = 0; j < mSoma[i].length; j++) {
                System.out.println(mSoma[i][j] + " ");
            }
        }

    }
}
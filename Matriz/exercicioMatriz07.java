import java.util.Scanner;

public class exercicioMatriz07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int m1[][] = new int[3][3];
        int i, j = 0;

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m1.length; j++) {
                m1[i][j] = m[2-j][i];
            }
        }
        

        System.out.println("Nova matriz(90º): " );
        for (i = 0; i < m.length; i++) {    
            for (j = 0; j < m1.length; j++) {
                System.out.println(m1[i][j] + " ");
            }

            System.out.println(" ");
            
        }

        System.out.println(m1[i][j]);
    }
}

import java.util.Scanner;
public class exercicioMatriz02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m1[][] = new int [3][3];
        int i, j = 0;

        for(j = 0; j < m1.length; j++){
            for(i = 0; i < m1[j].length; i++){
                System.out.println("Informe os elementos na posição " + (j) + " - " + (i) + ":");
                m1[i][j] = entrada.nextInt();
            }
        }

        for(i = 0; i < m1.length; i++){
            for(j = 0; j < m1[i].length; j++){
                System.out.println(m1[i][j]);
            }
        }
    }
}

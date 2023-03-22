import java.util.Scanner;
public class exercicioMatriz10 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        double mat[][] = new double[3][4];

        for (int i = mat.length - 1; i >= 0; i--) {
            for (int j = mat[i].length - 1 ; j >= 0; j--) {


               System.out.println("Insira o valor: mat["+i+"]["+j+"]");
               mat[i][j] = entrada.nextDouble();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.print(" \n");
        }
        
    }
}

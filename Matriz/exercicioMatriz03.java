import java.util.Scanner;

public class exercicioMatriz03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int m1[][] = new int[2][4];
        int i, j = 0;
        int pares = 0;
        int numPares = 0;
        int media = 0;

        for(i = 0; i < 2; i++){
            for(j = 0; j < 4; j++){
                System.out.println("Informe os elementos na posição " + i + " - " + j + ": ");
                m1[i][j] = entrada.nextInt();

                if(m1[i][j] % 2 == 0){
                    pares++;
                    numPares += m1[i][j];
                }
            }
        }

        media = (numPares/pares);

        System.out.println("A quantidade de números pares é de: " + pares);
        System.out.println("A média de números pares é de: " + media);
    }
}

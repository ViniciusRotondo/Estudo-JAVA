import java.util.Scanner;

public class exercicioMatriz09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matriz = new char[5][5];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (char) ('A' + (int) (Math.random() * 26));
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Digite uma letra: ");
        char letra = scanner.nextLine().charAt(0);

        boolean encontrou = false;
        System.out.print("Posições da letra " + letra + " na matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == letra) {
                    System.out.print("(" + i + "," + j + ") ");
                    encontrou = true;
                }
            }
        }
        if (!encontrou) {
            System.out.println("A letra " + letra + " não foi encontrada na matriz.");
        }
    }
}

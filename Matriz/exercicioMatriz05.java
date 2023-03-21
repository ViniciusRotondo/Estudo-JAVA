import java.util.Scanner;

public class exercicioMatriz05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int m[][] = new int[10][5];
        int i, j = 0;
        float somaClasse = 0;
        float mediaClasse = 0;

        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.println("Informe as notas dos alunos: ");
                m[i][j] = entrada.nextInt();
            }
        }

        for (i = 0;i < m.length;i++) {
            float soma = 0;
            for (j = 0; j < m[i].length; j++) {
                soma += m[i][j];
                somaClasse += m[i][j];
            }
            float media = soma / 5;
            if (media >= 6) {
                System.out.println("Media do " + (i+1) + "º aluno foi de: " + media + " e ele foi APROVADO");
            }else{
                System.out.println("Media do " + (i+1) + "º foi de: " + media + " e ele foi REPROVADO");
            }
        }

        mediaClasse = (somaClasse / 50);
        System.out.println("A média da sala foi: " + mediaClasse);
    }
}


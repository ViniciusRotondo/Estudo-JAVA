import java.util.Scanner;
public class exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i;
        int v1[] = new int[5];
        int v2[] = new int[5];
        int v3[] = new int[5];

        for(i = 0; i < v1.length; i++){
            System.out.println("Digite o índice " + i + " do vetor 1.");
            v1[i] = entrada.nextInt();
        }

        
        for(i = 0; i < v2.length; i++){
            System.out.println("Digite o índice " + i + " do vetor 2.");
            v2[i] = entrada.nextInt();
        }


        for(i = 0; i < v1.length; i++){
            v3[i] = v1[i] + v2[i];
        }


        for(i = 0; i < v3.length; i++){
            System.out.println("A soma do índice " + i + " do vetor 1 MAIS o índice " + i + " do vetor 2 é: " + v3[i]);
        }        
    }
}

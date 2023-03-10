import java.util.Scanner;
import java.util.Arrays;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int v1[] = new int[5];
        int v2[] = new int[5];

        System.out.println("Digite 5 valores para preencher o 1º vetor: ");
        for(int i = 0; i < v1.length; i++){
            v1[i] = entrada.nextInt();
        }


        
        for(int i = 4; i >= 0; i--){
            v2[i] = v1[i];
        }

        System.out.println(Arrays.toString(v2));
    }
}

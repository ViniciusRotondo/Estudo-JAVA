import java.util.Scanner;
/**
 * exercicio01
 */
public class exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        int media = 0;
        int somatoria = 0;
        int numeros[] = {1, 5, 6, 8, 15, 25, 26, 79, 47, 10, 94, 48, 36, 45, 82};

        for(i = 0; i < numeros.length; i++){
            somatoria += numeros[i];
        }
            media = somatoria/(numeros.length);
            
        System.out.println("A somatória desses numéros é: " + somatoria);
        System.out.println("A média desses números é " + media);
    }   
}
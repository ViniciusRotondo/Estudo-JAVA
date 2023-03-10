import java.util.Scanner;
/**
 * exercicio01
 */
public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        int x = 0;
        int pares = 0;
        int impares = 0;
        
        System.out.println("Quantos números você deseja digitar?");
        x = entrada.nextInt();

        int numeros [] = new int[x];

        for(i = 0; i < numeros.length; i++){
            System.out.println("Digite o valor que deseja no vetor: ");
            numeros[i] = entrada.nextInt();
        }

        for(i = 0; i < numeros.length; i++)
        if (numeros[i] % 2 == 0) {
            pares++;
        }else{
            impares++;
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números pares: " + impares);

    }    
}





/*         for(i = 0; i < numeros.length; i++){
            somatoria += numeros[i];
            media = somatoria/(numeros.length);
        }

        System.out.println("A somatória desses numéros é: " + somatoria);
        System.out.println("A média desses números é " + media);
    }   
} */

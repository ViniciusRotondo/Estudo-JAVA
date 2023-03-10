import java.util.Scanner;

public class exercicio6 {

public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    int idade;
    int total = 0;
    int media = 0;
    int maior = 0;


    for(int i = 1; i <= 10; i++){
        System.out.println("Informe a idade da pessoa " + i + ':');
        idade = entrada.nextInt();

        total += idade;
        media = total / 10;

        if(idade >= 18){
            maior++;
        }

    }

    System.out.println("A media é: " + media);
    System.out.println("Total de pessoas com 18 anos ou mais é: " + maior);
}

}

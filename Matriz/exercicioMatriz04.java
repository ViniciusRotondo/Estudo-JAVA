import java.util.Scanner;

public class exercicioMatriz04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int m[][] = new int[3][6];
        int i = 0;
        int j = 0;
        int LinhaMaiorNumero = 0;
        int colunaMaiorNumero = 0;
        int LinhaMenorNumero = 0;
        int colunaMenorNumero = 0;
        
        
        for(i = 0; i < m.length; i++){
            for(j = 0; j < m[i].length; j++){
                System.out.println("Informe os elementos na posição " + i + " - " + j + ": ");
                m[i][j] = entrada.nextInt();            
            }
        }
            int maior = m[0][0];
            int menor = m[0][0];

            for (i = 0; i < m.length; i++) {
                for (j = 0; j < m[i].length; j++) {
                    
                    if(m[i][j] > maior){
                        maior = m[i][j];
                        LinhaMaiorNumero = i;
                        colunaMaiorNumero = j;
                    }
                    
                    if(m[i][j] < menor){
                        menor = m[i][j];
                        LinhaMenorNumero = i;
                        colunaMenorNumero = j;
                    }
                }               
            }

        System.out.println("O maior número dessa matriz é o " + maior + " e ele está na posição " + LinhaMaiorNumero + " - " + colunaMaiorNumero);
        System.out.println("");
        System.out.println("O menor número dessa matriz é o " + menor + " e ele está na posição " + LinhaMenorNumero + " - " + colunaMenorNumero);
    }
}

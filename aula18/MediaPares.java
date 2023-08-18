package aula18;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        
        int n, num = 0, qtd=0;
        double media= 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos elementos terá o vetor? ");
        n = leia.nextInt();

        int[] vetor= new int[n];

        for (int i = 0; i <n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = leia.nextInt();
        }
        for (int i = 0; i < n; i++) {
            
            if (vetor[i] % 2 ==0){
                num+= vetor[i];
                qtd++;
        }
        }
        if( qtd == 0){
            System.out.println("Não tem pares!");
        }
         media = num / qtd;

        System.out.println(media);
        
        leia.close();
        }
    }  
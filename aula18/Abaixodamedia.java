package aula18;

import java.util.Scanner;

public class Abaixodamedia {
    public static void main(String[] args) {
        
        int n;
        Scanner leia = new Scanner(System.in);
        double soma, media;

        System.out.println("Quantos elementos terá o vetor? ");
        n = leia .nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = leia.nextDouble();
        }

        soma= 0;
        for (int i = 0; i <n; i++) {
            soma+= vetor[i];
            
        }

        media = soma/n;

        System.out.printf("\nMedia do vetor = %.3f\n", media);
        System.out.println("Elementos abaixo da média: ");
        
        for (int i = 0; i < n; i++) {
            if (vetor[i] < media){
                System.out.printf("%.1f\n", vetor[i]);
            }
          leia.close();  
        }
    }
}
package algo.poo.conceitos;

import java.util.Scanner;

public class Fatorial {
    private int numero;
    private int fatorial;

    Fatorial (int numero){
        this.numero = numero;
    }
    public int gerarFatorial(int numero){
        for (int i = numero; i> 0; i--) 
            fatorial*=numero;
        return fatorial;
    }






    public static void main (String[] args){
        int numero, fatorial = 1;
        Scanner leia = new Scanner(System.in);

        System.out.println("Número: ");
        numero = leia.nextInt();

        for (int i = numero; i> 0; i--) {
            System.out.print(i);
            if (i > 1)
            System.out.print(" * ");
            fatorial *=i;
            
        
        }
        System.out.println(" = " +fatorial);
    }
}

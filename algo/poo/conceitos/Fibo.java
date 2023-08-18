package algo.poo.conceitos;


public class Fibo {   
    private int anterior;
    private int atual;
    private int vezes;
    private int[] fibonacci;
    Fibo(int vezes){
        this.vezes = vezes;
        fibonacci = new int[vezes];
        anterior = fibonacci[0] = 0;
        atual = fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = anterior + atual;
            anterior = atual;
            atual = fibonacci[i];
        }

    }
    public static void main(String[] args) {
       
       Fibo fibo = new Fibo(20);
       for (int i = 0; i < 20; i++) {
        System.out.print(fibo.fibonacci[i]);
        System.out.print(" ");
       }
    }
}
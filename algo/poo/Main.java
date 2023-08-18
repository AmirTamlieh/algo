package algo.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.println("Digite o valor do lado 1: ");
        lado1 = leia.nextDouble();
        System.out.println("Digite o valor do lado 2 ");
        lado2 = leia.nextDouble();
        System.out.println("Digite o valor do lado 3: ");
        lado3 = leia.nextDouble();

        Triangle triangulo = new Triangle(lado1, lado2, lado3);
       if (triangulo.ehTriangulo())
       System.out.println("É triângulo.");

       else System.out.println("Não é triangulo.");
     
       if (triangulo.ehEquilatero())
       System.out.println("É equilatero.");
      
       if (triangulo.ehEscaleno())
       System.out.println("É escaleno.");

       if (triangulo.ehIsosceles())
       System.out.println("É isosceles.");

        leia.close();
    }
    
}

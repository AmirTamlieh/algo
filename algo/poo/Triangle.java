package algo.poo;

public class Triangle {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangle(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public boolean ehTriangulo(){
        return (lado1 > 0 && lado2 > 0 && lado3 > 0 && 
            lado1 + lado2 >= lado3 &&
            lado1 + lado3 >= lado2 &&
            lado2 + lado3 >=lado1);
    }
    public boolean ehEquilatero(){
        return (lado1 == lado2 && lado2 == lado3);
    }
    public boolean ehIsosceles(){
        return (lado1 == lado2 && lado1 != lado3
             || lado1 == lado3 && lado1 != lado2
             || lado2 == lado3) && lado2 != lado1;
    }
    public boolean ehEscaleno(){
        return (lado1 != lado2 &&
                lado2 != lado3 &&
                lado2 != lado1);
    }
}
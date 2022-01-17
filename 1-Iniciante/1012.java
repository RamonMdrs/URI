import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        double a,b,c;
        Scanner S = new Scanner(System.in);
        a = S.nextDouble();
        b = S.nextDouble();
        c = S.nextDouble();
        double pi = 3.14159;
        double triangulo = (a*c)/2;
        double circle = pi*(Math.pow(c,2));
        double trapezio = ((a+b)*c)/2;
        double quadrado = Math.pow(b,2);
        double retangulo = (a*b);
        
        System.out.printf("TRIANGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circle);
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETANGULO: %.3f\n", retangulo);
        
    }
 
}
import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        final double n = 3.14159;
        double R, A;
        Scanner S = new Scanner (System.in);
        R = S.nextDouble();
        A = (R*R)* n;
        System.out.printf("A=%.4f\n", A);
    }
 
}
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
        int a, b, c = 0;
        Scanner s = new Scanner( System.in );
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;
        System.out.println( "SOMA = " + c );
    }
 
}
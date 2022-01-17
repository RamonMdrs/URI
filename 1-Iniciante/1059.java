import java.io.IOException;
import java.lang.Math; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int num=1;
        while(num < 101){
            if(num%2 == 0){
                System.out.printf("%d\n", num);
            }
           num += 1;
        }
 
    }
 
}
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
        
        Scanner input = new Scanner(System.in);
        float x, y;
        x = input.nextFloat(); y = input.nextFloat();
        if(x == 0 && y == 0){
            System.out.printf("Origem\n");
        }else if(x == 0 && y != 0){
            System.out.printf("Eixo Y\n");
        }else if(y == 0 && x != 0){
            System.out.printf("Eixo X\n");
        }else if(y > 0 ){
            if(x > 0){
                System.out.printf("Q1\n");
            }else{
                System.out.printf("Q2\n");
            }
        }else if(x > 0){
            System.out.printf("Q4\n");
        }else{
            System.out.printf("Q3\n");
        }
 
    }
 
}
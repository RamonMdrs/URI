import java.io.IOException;
import java.lang.String;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        String palavra;
        Scanner input = new Scanner(System.in);
        palavra = input.nextLine();
        if(palavra.length()<10){
            System.out.printf("palavrinha\n");
        }else{
            System.out.printf("palavrao\n"); 
        }
 
    }
 
}
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int lanche, quantidade;
        float valor;
        Scanner input = new Scanner(System.in);
        lanche = input.nextInt(); quantidade = input.nextInt();
        if(lanche == 1){
            valor = (float)quantidade*4.00f;
            System.out.printf("Total: R$ %.2f\n", valor);
        }else if(lanche == 2){
            valor = (float)quantidade*4.50f;  
            System.out.printf("Total: R$ %.2f\n", valor);
        }else if(lanche == 3){
            valor = (float)quantidade*5.00f;
            System.out.printf("Total: R$ %.2f\n", valor);
        }else if(lanche == 4){
            valor = (float)quantidade*2.00f;
            System.out.printf("Total: R$ %.2f\n", valor);
        }else if(lanche == 5){
            valor = (float)quantidade*1.50f;
            System.out.printf("Total: R$ %.2f\n", valor);
        }
    }
}
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
 
 // 4(num1) 3(num2) 5(num3)
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        num1 = input.nextInt(); num2 =input.nextInt(); num3 = input.nextInt();
        
        if(num1 > num2 && num2 > num3){ 
            
            System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", num3,num2,num1,num1,num2,num3);
        
        }else if(num1 > num2 && num2 == num3){
        
            System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", num2,num3,num1,num1,num2,num3);
        
        }else if(num1 > num3 && num3 > num2){
         
            System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", num2,num3,num1,num1,num2,num3);
    
        }else if(num2 > num3 && num3 > num1){
            
             System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", num1,num3,num2,num1,num2,num3);
            
        }else if(num2 > num1 && num1 >num3){
            
             System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", num3,num1,num2,num1,num2,num3);
            
        }else if(num2 > num1 && num1 == num3){
            
            System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", num3,num1,num2,num1,num2,num3);
        
        }else if(num3 > num2 && num2 > num1){
            
             System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", num1,num2,num3,num1,num2,num3);
            
        }else if(num3 > num1 && num1 > num2){
            
             System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", num2,num1,num3,num1,num2,num3);
            
        }else if(num3 > num1 && num1 == num2){
            
            System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", num3,num2,num1,num1,num2,num3);
            
        }else{
            
            System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", num1,num2,num3,num1,num2,num3);
            
        }
        
        
    }
 
}
import java.io.IOException;
import java.lang.Math; 
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        int falta, num1, num2;
        num1 = input.nextInt();
        num2 = input.nextInt();
        if(num2%2 != 0){
            num2 -= 1;
            falta = num2/2 - num1;
            System.out.printf("Faltam %d bolinha(s)\n", falta);
        }else if((num2/2)== num1 || (num2/2)< num1){
            System.out.printf("Amelia tem todas bolinhas!\n");
        }else{
            falta = num2/2 - num1;
            System.out.printf("Faltam %d bolinha(s)\n", falta);
        }
        

    } 
}
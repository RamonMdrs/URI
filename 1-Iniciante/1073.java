import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
        Scanner input = new Scanner(System.in);
        int quant, quadrado = 0;
        quant = input.nextInt();
        for(int i = 1; i <=quant; i++){
            if(i%2 == 0){
                quadrado = (int)Math.pow( i , 2);
                System.out.printf("%d^2 = %d\n", i, quadrado);
            }
        }
    }
}
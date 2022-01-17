import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        double leitura;
        int positivo = 0;
        for(int i=0; i <6; i++){
            leitura = input.nextDouble();
            if(leitura > 0){
                positivo += 1;
            }
        }
        System.out.printf("%d valores positivos\n", positivo);    
    }
 
}
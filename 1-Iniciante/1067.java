import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
        Scanner input = new Scanner(System.in);
        int entrada;
        entrada = input.nextInt();
        for(int i=1; i <= entrada; i++){
            if(i % 2 != 0){
                System.out.printf("%d\n", i);
            }
        }

    }
}
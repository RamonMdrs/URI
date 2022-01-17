import java.io.IOException;
import java.util.Scanner;

import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
        Scanner input = new Scanner(System.in);
        int primeiro, segundo, impar = 0, aux;
        primeiro = input.nextInt();
        segundo = input.nextInt();
        if(primeiro < segundo ){
            for(int i = primeiro + 1; i < segundo; i++){
                if(i%2 != 0){
                    impar += 1; 
                }
            }
            System.out.printf("%d", impar);
        }else{
            aux = primeiro;
            primeiro = segundo;
            segundo = aux;
            for(int i = primeiro+1; i < segundo; i++){
                if(i%2 != 0){
                    impar += 1; 
                }
            }
            System.out.printf("%d", impar);
        }
    }
}
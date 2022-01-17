import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main{
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int numero, totalPar = 0;
        for(int i=0; i<5; i++){
            numero = input.nextInt();
            if(numero%2 == 0){
                totalPar += 1;
            }
        }
        System.out.printf("%d valores pares\n", totalPar);
    }
}
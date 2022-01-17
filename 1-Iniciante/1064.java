import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        double numero, media = 0, total;
        int positivo = 0;
        for(int i = 0; i <6; i++){
            numero = input.nextDouble();
            if(numero > 0){
                positivo += 1;
                media += numero;
            }
        }
        total = media/(float)positivo;
        System.out.printf("%d valores positivos\n", positivo);
        System.out.printf("%.1f\n", total);
    }
}
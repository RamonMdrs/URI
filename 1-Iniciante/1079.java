import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
        Scanner input = new Scanner(System.in);
        int quant;
        double n1, n2, n3, media;
        quant = input.nextInt();
        for(int i = 0; i < quant; i++){
            n1 = input.nextDouble();
            n2 = input.nextDouble();
            n3 = input.nextDouble();
            media = ((n1*2)+(n2*3)+(n3*5))/10;
            System.out.printf("%.1f\n", media);
        }    
    }
}

// 3
// 6.5 4.3 6.2
// 5.1 4.2 8.1
// 8.0 9.0 10.0
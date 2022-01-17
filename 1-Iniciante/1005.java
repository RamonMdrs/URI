import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        float A, B, MEDIA = 0;
        Scanner S = new Scanner (System.in);
        A = S.nextFloat();
        A = A*3.5f;
        B = S.nextFloat();
        B = B*7.5f;
        MEDIA = (A+B)/11;
        System.out.printf("MEDIA = %.5f\n", MEDIA);
        
    }
}
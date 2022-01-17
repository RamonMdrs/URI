import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        float A, B, C, MEDIA;
        Scanner S = new Scanner(System.in);
        A = S.nextFloat();
        B = S.nextFloat();
        C = S.nextFloat();
        MEDIA = ((A*2)+(B*3)+(C*5))/10;
        System.out.printf("MEDIA = %.1f\n", MEDIA);
 
    }
 
}
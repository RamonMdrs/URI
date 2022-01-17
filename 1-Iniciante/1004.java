import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int x, y , PROD = 0;
        Scanner S = new Scanner(System.in);
        x = S.nextInt();
        y = S.nextInt();
        PROD = x * y;
        System.out.println("PROD = "+PROD);

    }
 
}
import java.io.IOException;
import java.util.Scanner; 


public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int A, B, C, D, result;
        Scanner S = new Scanner(System.in);
        A = S.nextInt();
        B = S.nextInt();
        C = S.nextInt();
        D = S.nextInt();
        result = A*B-C*D;
        System.out.println("DIFERENCA = " + result);
    }
 
}
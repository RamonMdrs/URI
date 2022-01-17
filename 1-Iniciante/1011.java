import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;


public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double R;
        double pi = 3.14159;
        Scanner S= new Scanner(System.in);
        R = S.nextDouble();
        double total = ((4.0/3)*pi*(Math.pow(R,3)));
        System.out.printf("VOLUME = %.3f\n", total); 
    }
}
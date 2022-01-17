import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        double x1, y1, x2, y2, distancia;
        Scanner S = new Scanner(System.in);
        x1 = S.nextDouble(); y1 = S.nextDouble();
        x2 = S.nextDouble(); y2 = S.nextDouble();
        distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.printf("%.4f\n", distancia);
    }
}
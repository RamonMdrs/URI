import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int km;
        float liters, total;
        Scanner S = new Scanner(System.in);
        km = S.nextInt();
        liters = S.nextFloat();
        total = (float)km/liters;
        System.out.printf("%.3f km/l\n", total);
        
        
    }
 
} 

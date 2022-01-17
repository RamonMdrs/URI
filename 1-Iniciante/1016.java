import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
        int tempo , km;
        Scanner S= new Scanner(System.in);
        km = S.nextInt();
        tempo = km *2;
        System.out.printf("%d minutos\n", tempo);
        
    }
 
}
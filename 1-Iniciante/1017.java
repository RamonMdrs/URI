import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
        int horas, velocidade;
        double litros;
        Scanner input = new Scanner(System.in);
        horas = input.nextInt();
        velocidade = input.nextInt();
        litros = ((double)horas*(double)velocidade)/12;
        System.out.printf("%.3f\n", litros);
 
    }
 
}
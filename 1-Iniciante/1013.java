import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int valor1, valor2, valor3, maiorAB, maiorAC;
        Scanner S = new Scanner(System.in);
        valor1 = S.nextInt();valor2 = S.nextInt();valor3 = S.nextInt();

        maiorAB = (valor1+valor2 + Math.abs(valor1-valor2))/2;
        maiorAC = (maiorAB+valor3 + Math.abs(maiorAB-valor3))/2;
        System.out.printf("%d eh o maior\n", maiorAC);
        
        
    }
 
} 

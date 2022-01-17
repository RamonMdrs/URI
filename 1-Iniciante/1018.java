import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        int valor;
        valor = input.nextInt();
        int aux = valor;
        System.out.printf("%d\n",aux);
        int nota100 = valor/100;
        valor = valor - (nota100*100);
        System.out.printf("%d nota(s) de R$ 100,00\n", nota100);
        int nota50 = valor/50;
        valor = valor - (nota50*50);
        System.out.printf("%d nota(s) de R$ 50,00\n", nota50);
        int nota20 = valor/20;
        valor = valor - (nota20*20);
        System.out.printf("%d nota(s) de R$ 20,00\n", nota20);
        int nota10 = valor/10;
        valor = valor - (nota10*10);
        System.out.printf("%d nota(s) de R$ 10,00\n", nota10);
        int nota5 = valor/5;
        valor = valor - (nota5*5);
        System.out.printf("%d nota(s) de R$ 5,00\n", nota5);
        int nota2 = valor/2;
        valor = valor - (nota2*2);
        System.out.printf("%d nota(s) de R$ 2,00\n", nota2);
        int nota1 = valor;
        valor = valor - (nota1);
        System.out.printf("%d nota(s) de R$ 1,00\n", nota1);
        
    }
 
}
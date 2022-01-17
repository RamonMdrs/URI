import java.io.IOException;
import java.util.Scanner;
/**
* IMPORTANT:
* O nome da classe deve ser "Main" para que a sua solução execute
* Class name must be "Main" for your solution to execute
* El nombre de la clase debe ser "Main" para que su solución ejecutar
*/
public class Main {

    public static void main(String[] args) throws IOException {

        String name;
        double fixo, vendas;
        Scanner S = new Scanner(System.in);
        name = S.nextLine();
        fixo = S.nextFloat();
        vendas = S.nextFloat();
        double bonus = (vendas*15)/100;
        double total = fixo + bonus;
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
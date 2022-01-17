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

        int codigo, qtd,codigo2, qtd2;
        float valorp1, valorp2;
        Scanner S = new Scanner(System.in);
        codigo = S.nextInt(); qtd = S.nextInt(); valorp1 = S.nextFloat();
        codigo2 = S.nextInt(); qtd2 = S.nextInt(); valorp2 = S.nextFloat();
        float totalp1 = (float)qtd * valorp1;
        float totalp2 = (float)qtd2 * valorp2;
        float soma = totalp1 + totalp2;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", soma);
    }
}
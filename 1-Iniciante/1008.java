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

        int employee, hours;
        float salary;
        Scanner S = new Scanner(System.in);
        employee = S.nextInt();
        hours = S.nextInt();
        salary = S.nextFloat();
        float total = salary*(float)hours;
        System.out.printf("NUMBER = %d\n", employee);
        System.out.printf("SALARY = U$ %.2f\n", total);
    }

}
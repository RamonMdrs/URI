import java.io.IOException;
import java.lang.Math; 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        int quantidade, num;
        quantidade = input.nextInt();
        for(int i = 1; i <=quantidade; i++){
            num = input.nextInt();
            System.out.printf("resposta %d: %d\n", i, num);
        }
    } 
}
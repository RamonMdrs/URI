import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
        Scanner input = new Scanner(System.in);
        int quantidade, num, odd, even;
        quantidade = input.nextInt();
        for(int i = 0; i < quantidade; i++){
            num = input.nextInt();
            if(num == 0){
                System.out.printf("NULL\n");
            }else if(num > 0){
                if(num%2 == 0){
                    System.out.printf("EVEN POSITIVE\n");
                }else{
                    System.out.printf("ODD POSITIVE\n");
                }
            }else{
                if(num%2 == 0){
                    System.out.printf("EVEN NEGATIVE\n");
                }else{
                    System.out.printf("ODD NEGATIVE\n");
                }
            }
        }
    }
}
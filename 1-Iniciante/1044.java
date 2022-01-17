import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;


public class Main {
 
    public static void main(String[] args) throws IOException {
        
        int a,b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();b = input.nextInt();
        if(a%b == 0 || b%a == 0){
            System.out.printf("Sao Multiplos\n");
        }else{
            System.out.printf("Nao sao Multiplos\n");
        }
    }
 
}
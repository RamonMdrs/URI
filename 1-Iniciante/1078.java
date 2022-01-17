import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
        Scanner input = new Scanner(System.in);
        int num, result;
        num = input.nextInt();
        for(int i = 1; i <= 10; i++){
            result = i*num;
            System.out.printf("%d x %d = %d\n", i, num, result);
        }
    }
}
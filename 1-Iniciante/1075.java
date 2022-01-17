import java.io.IOException;
import java.lang.Math; 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        for(int i = 1; i <=10000; i++){
            if(i%num == 2){
                System.out.printf("%d\n", i);
            }
        }
    } 
}
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
        Scanner input = new Scanner(System.in);
        int quant, num, in = 0, out = 0;
        quant = input.nextInt();
        for(int i = 0; i < quant; i++){
            num = input.nextInt();
            if(num >=10 && num <= 20){
                in += 1;
            }else{
                out += 1;
            }
        }
        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
    }
}

// 4
// 14
// 123
// 10
// -25
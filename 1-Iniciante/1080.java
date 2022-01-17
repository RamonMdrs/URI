import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
        Scanner input = new Scanner(System.in);
        int i, maior = 0, num, posicao = 0;
        for(i=1;i<=100;i++){
            num = input.nextInt();
            if(maior<num){
                maior=num;
                posicao=i;
            }
        }
        System.out.printf("%d\n",maior);
        System.out.printf("%d\n",posicao);
    }
}

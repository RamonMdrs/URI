import java.io.IOException;
import java.lang.String;
import java.util.Scanner;
/*
 Huguinho = 7, Zezinho = 6, Luizinho = 5;
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        int h, z, l;
        h = input.nextInt();
        z = input.nextInt();
        l= input.nextInt();
        //Mais novo = LUISINHO
        //Do meio = ZEZINHO
        //Mais velho = HUGUINHO
        if ((z > h && h > l) || (z < h && h < l)){
            System.out.printf("huguinho\n");
        }else if((h > z && z > l) || (h < z && z < l)){
            System.out.printf("zezinho\n");
        }else{
            System.out.printf("luisinho\n");
        }
    }
}
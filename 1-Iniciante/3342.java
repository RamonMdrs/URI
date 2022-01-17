import java.io.IOException;
import java.lang.Math; 
import java.util.Scanner;

public class Main{
 
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        int branco, preto, area;
        int tamanho = input.nextInt();
        area = tamanho * tamanho;
        if(tamanho %2 !=0){
            branco = (area/2)+1;
            preto = area/2;
        }else{
            branco = area/2;
            preto = area/2;
        }        
        System.out.printf("%d casas brancas e %d casas pretas\n",branco, preto);      
    } 
}
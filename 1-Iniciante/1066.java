import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main{
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int numero, par = 0, impar = 0, positivo = 0, negativo = 0;
        for(int i=0; i<5; i++){
            numero = input.nextInt();
            if(numero == 0){
               par +=1;
            }else if(numero > 0){
                positivo +=1;
                if(numero%2 == 0){
                    par += 1;
                }else{
                    impar += 1;
                }
            }else{
                negativo +=1;
                if(numero%2 == 0){
                    par += 1;
                }else{
                    impar += 1;
                }
            }    
        }
        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", positivo);
        System.out.printf("%d valor(es) negativo(s)\n", negativo);
    }
}
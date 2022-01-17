import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int tempo, segundo, minuto, hora;
        Scanner input = new Scanner(System.in);
        tempo = input.nextInt();
        hora = (tempo - (tempo % 3600)) / 3600;
        tempo -= hora *3600;
        minuto =(tempo -( tempo% 60))/60;
        tempo -= minuto *60;
        segundo = tempo;
        System.out.printf("%d:%d:%d\n",hora,minuto,segundo);
    }
 
}
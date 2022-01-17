import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int idade, ano, dia, mes;
        Scanner input = new Scanner(System.in);
        idade = input.nextInt();
        ano = (idade- (idade % 365))/365;
        idade -= (ano *365);
        mes = (idade - (idade % 30))/30;
        idade -= (mes * 30);
        dia = idade;
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
        
    }
 
}
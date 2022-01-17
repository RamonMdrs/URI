import java.io.IOException;
import java.util.Scanner;
import java.lang.Math; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        double salario, percentual, reajuste, novoSalario;
        salario = input.nextDouble();
        if(salario <= 400){
            percentual = 0.15;
            reajuste = salario*percentual;
            novoSalario = salario+reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 15 %c\n", 37 );
        }else if(salario > 400 && salario <= 800){
            percentual = 0.12;
            reajuste = salario*percentual;
            novoSalario = salario+reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 12 %c\n", 37 );
        }else if(salario > 800 && salario <= 1200){
            percentual = 0.10;
            reajuste = salario*percentual;
            novoSalario = salario+reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 10 %c\n", 37 );
        }else if(salario > 1200.0 && salario <= 2000){
            percentual = 0.07;
            reajuste = salario*percentual;
            novoSalario = salario+reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 7 %c\n", 37 );
        }else if(salario > 2000.0 ){
            percentual = 0.04;
            reajuste = salario*percentual;
            novoSalario = salario+reajuste;
            System.out.printf("Novo salario: %.2f\n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f\n", reajuste);
            System.out.printf("Em percentual: 4 %c\n", 37 );
        }
    }
}
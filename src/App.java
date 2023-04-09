import java.util.Scanner;

public class App 

{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int N1;
        int N2;
        int soma;

        System.out.print("Digite o primeiro número: ");
        N1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        N2 = entrada.nextInt();

        soma = N1 + N2;

        System.out.println("A soma é igual a: " + soma);

        
    }
}

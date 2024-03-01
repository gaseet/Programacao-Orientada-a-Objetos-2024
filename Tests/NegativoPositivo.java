import java.util.Scanner;

public class NegativoPositivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número inteiro:");
        int numero = leitor.nextInt();

        if (numero < 0) {
            System.out.println("Número negativo.");
        } else if (numero > 0) {
            System.out.println("Número positivo.");
        } else {
            System.out.println("Igual a zero.");
        }
        leitor.close();
    }
}

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a idade:");
        int idade = leitor.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida.");
        } else if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }
        leitor.close();
    }
}

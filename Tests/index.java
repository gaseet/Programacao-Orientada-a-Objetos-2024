import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um inteiro: ");
        int inteiro = leitor.nextInt();
        System.out.println("Número inteiro: " + inteiro);
        
        System.out.println("Informe um double: ");
        double real = leitor.nextDouble();
        System.out.println("Número float: " + real);
        
        System.out.println("Informe valor booleano: ");
        boolean logico = leitor.nextBoolean();
        leitor.nextLine();
        System.out.println("Booleano: " + logico);
        
        System.out.println("Informe uma frase: ");
        String cadeia = leitor.nextLine();
        System.out.println("Frase: " + cadeia);

        leitor.close();
    }
}
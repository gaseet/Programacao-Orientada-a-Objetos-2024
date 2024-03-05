import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        final Scanner leitor = new Scanner(System.in);

        String[] array = new String[5];
        for(int i = 0; i < array.length; i++) {
            System.out.print("Informe o nome " + i + ": ");
            array[i] = leitor.nextLine();
        }
        for (String i : array) {
            System.out.print(i + " ");
        }
        leitor.close();
    }
}
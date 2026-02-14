import java.util.Scanner;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first parameter:");
        int firstParameter = scanner.nextInt();

        System.out.println("Enter the second parameter:");
        int secondParameter = scanner.nextInt();

        try {
            Contador.count(firstParameter, secondParameter);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

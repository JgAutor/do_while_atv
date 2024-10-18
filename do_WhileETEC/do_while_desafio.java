import java.util.Scanner;

public class do_while_desafio {
    public static void main(String[] args) {
        System.out.println("Sistema de resgistro de números:");
        Scanner scanner = new Scanner(System.in);
        
        int numInseridos = 0;
        int userNumbers;

        do {
            System.out.println("Insira um novo número;");
            userNumbers = scanner.nextInt();

            if (userNumbers != 0) {
                numInseridos++;
            }

        } while (userNumbers != 0);
        System.out.println(numInseridos+" números registrados:");
        
        scanner.close();
    }
}

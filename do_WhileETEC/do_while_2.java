import java.util.Scanner;

public class do_while_2 {
    public static void main(String[] args) {
        System.out.println("Sistema de Validação de Senha:");
        Scanner scanner = new Scanner(System.in);

        int realKey = 678843;
        int userKey;

        do {
            System.out.println("Digite sua Senha:");
            userKey = scanner.nextInt();

            if (userKey != realKey) {
                System.out.println("Senha Incorreta.");
            }
        } while (userKey != realKey);

        System.out.println("Senha correta inserida. Acesso total liberado:");
        
        scanner.close();
    }
}
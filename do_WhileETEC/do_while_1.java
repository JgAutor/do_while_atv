import java.util.Scanner;

public class do_while_1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Sistema de contagem Regressiva:");
        Scanner scanner = new Scanner(System.in);
        
        int countNum = scanner.nextInt();

        do {
            System.out.println(countNum);
            countNum--;
        } while (countNum >= 1);

        System.out.println("Fim da Contagem");
    }
}

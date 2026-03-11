
import java.util.Scanner;

public class entradaesaidadedados {

    public static void main(String[] args) {
        System.out.println("ola, seja bem vindo");

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("nome: " + nome);

        System.out.println("digite seu email:");
        String email = scanner.nextLine();
        System.out.println("email: " + email);

        System.out.println("digite seu CPF:");
        String cpf = scanner.nextLine();
        System.out.println("CPF: " + cpf);
    }
}

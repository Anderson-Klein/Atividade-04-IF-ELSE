import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String nome = "";
        String senha = "";

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nome do usuario: ");
        nome = scanner.nextLine();

        System.out.printf("Senha do usuario: ");
        senha = scanner.nextLine();

       if (nome.equals("usuario") && senha.equals("senha123")) {
           System.out.printf("Login bem-sucedido");
       }else {
           System.out.printf("Nome de usuário ou senha incorretos");
       }
    }
}

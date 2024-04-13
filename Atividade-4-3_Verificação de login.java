import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        String nome = "";
        String senha = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do usuario: ");
        nome = scanner.nextLine();

        System.out.println("Senha do usuario: ");
        senha = scanner.nextLine();

       if (nome.equals("usuario") && senha.equals("senha123")) {
           System.out.println("Login bem-sucedido");
       }else {
           System.out.println("Nome de usuário ou senha incorretos");
       }
    }
}

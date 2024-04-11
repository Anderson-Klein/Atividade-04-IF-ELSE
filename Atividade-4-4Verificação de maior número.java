import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        num1 = sc.nextInt();

        System.out.printf("Digite um numero: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.printf(num1 + " É maior que " + num2);
        } else if (num1 < num2) {
            System.out.printf(num2 + " É maior que " + num1);
        } else if (num1 == num2) {
            System.out.printf("Os números são iguais!");
        }
    }
}

import java.util.Scanner;
public class Idades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu ano de nascimento: ");
        int nascimento = sc.nextInt();

        int idade = 2024 - nascimento;

        System.out.println("Idade = " + idade);

    }
}

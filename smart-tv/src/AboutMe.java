import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura: ");
        double altura = scanner.nextDouble();


        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " Arthcm ");


    }
}

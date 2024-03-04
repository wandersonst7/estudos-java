import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade? ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual a sua comida preferida? ");
        String comida = scanner.nextLine();

        /*
            Aqui está ocorrendo um bug que, não está sendo possível ler
            o nome da comida.

            Isso acontece porque na linha superior, "nextInt()" ler apenas
            caracteres numéricos e ao darmos "enter", um "\n" irá ser digitado.

            O que ocorre é que esse "\n" irá 'sobrar' para o nextLine() do Scanner
            logo abaixo, como se tivesse disparado um "enter",
            fazendo com que não seja possível ler o novo valor.

            Solução: adicionar um nextLine() após a leitura do nextInt()
            scanner.nextLine();

         */

        System.out.println("Olá, "+nome);
        System.out.println("Voce tem "+idade+" anos de idade");
        System.out.println("Sua comida favorita é "+comida);
    }
}
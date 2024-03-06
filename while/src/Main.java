import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = "";

//        while(nome.isBlank()){
//            System.out.println("Digite seu nome: ");
//            nome = scanner.nextLine();
//        }

        do{
            System.out.println("Digite seu nome: ");
            nome = scanner.nextLine();
        }while(nome.isBlank());

        System.out.println("Olá, "+nome);

    }
}
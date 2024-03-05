import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            Operadores Lógicos do Java
            * && = and
            * || = or
            * ! = not
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Você está jogando o jogo! Pressione q ou Q para sair");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("Você saiu do jogo!");
        }else{
            System.out.println("Você está jogando o jogo");
        }

    }
}
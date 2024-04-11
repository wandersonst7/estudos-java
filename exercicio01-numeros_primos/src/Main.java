import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {

        boolean stop = false;

        while(!stop){

            if(stop){
                break;
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("--- Exercicio Números Primos ---");
            System.out.print("Digite um número: ");
            Integer numero = scanner.nextInt();

            // limpando lixo
            scanner.nextLine();

            Primo.primo(numero);

            while(true){
                System.out.print("Deseja continuar? [s/n] ");
                String verify = scanner.nextLine().toLowerCase();

                if(verify.equals("s")){
                    break;
                }else if(verify.equals("n")){
                    stop = true;
                    break;
                }else{
                    System.out.println("Digite uma opção válida!");
                }

            }

        }

    }

}
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Numero 1: ");
            int x = scanner.nextInt();

            System.out.print("Numero 2: ");
            int y = scanner.nextInt();

            int z = x/y;
            System.out.println("Resultado: " + z);

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Não é possivel dividir por zero!");
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("Apenas numeros são aceitos");
        }catch (Exception e){
            System.out.println("Algo deu errado");
        }finally {
            System.out.println("O finally sempre será executado!");
            /* Quando você utiliza o método "scanner.close()",
            você está encerrando a instância do Scanner que foi criada no início do código.
            Isso é importante porque libera recursos
            do sistema que foram alocados para a instância do Scanner. */
            scanner.close();
        }


    }

}